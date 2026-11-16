package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.Timer;

public class GradientButton extends JButton implements ActionListener {
	private static final int ANIMATION_DELAY_MS = 15;
	private static final int ANIMATION_STEP_PX = 20;

	private JDmainMenu jDmainMenu;
	private Timer animationTimer;
	private boolean isExpanding;
	private int currentWidth;

	private Color color1 = Color.black;
	private Color color2 = Color.white;

	public GradientButton() {
		setBackground(Color.black);
		setFocusPainted(false);
		this.addActionListener(this);

		jDmainMenu = new JDmainMenu(0, 0);
		isExpanding = false;
		currentWidth = 0;

		animationTimer = new Timer(ANIMATION_DELAY_MS, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stepAnimation();
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g.create();
		for (int i = 0; i < 11; i++) {
			g2.setColor(i == 3 || i == 4 || i == 7 || i == 8 ? color1 : color2);
			g2.drawLine(0, i, getWidth(), i);
		}
		g2.drawLine(0, 11, getWidth(), 11);
		g2.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		isExpanding = !isExpanding;
		updateMenuLocation();

		if (isExpanding && !jDmainMenu.isVisible()) {
			currentWidth = Math.max(currentWidth, ANIMATION_STEP_PX);
			jDmainMenu.setWidth(currentWidth);
			jDmainMenu.setVisible(true);
		}

		if (!animationTimer.isRunning()) {
			animationTimer.start();
		}
	}

	private void stepAnimation() {
		updateMenuLocation();

		if (isExpanding) {
			currentWidth = Math.min(JDmainMenu.MENU_WIDTH, currentWidth + ANIMATION_STEP_PX);
			jDmainMenu.setWidth(currentWidth);
			if (currentWidth >= JDmainMenu.MENU_WIDTH) {
				animationTimer.stop();
			}
		} else {
			currentWidth = Math.max(0, currentWidth - ANIMATION_STEP_PX);
			if (currentWidth == 0) {
				animationTimer.stop();
				jDmainMenu.setVisible(false);
				jDmainMenu.setWidth(0);
			} else {
				jDmainMenu.setWidth(currentWidth);
			}
		}
	}

	private void updateMenuLocation() {
		Container parent = getParent();
		if (parent != null && parent.isShowing()) {
			Point parentOnScreen = parent.getLocationOnScreen();
			jDmainMenu.setMenuLocation(parentOnScreen.x, parentOnScreen.y + parent.getHeight());
		}
	}

	public void changeLanguage() {
		jDmainMenu.changeLanguage();
	}

	public void sendCoordinates(Point point2d) {
		updateMenuLocation();
	}
}
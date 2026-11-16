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
	private static final double ANIMATION_DURATION_MS = 1000.0;

	private JDmainMenu jDmainMenu;
	private Timer animationTimer;
	private boolean isExpanding;
	private int currentWidth;
	private int startWidth;
	private int targetWidth;
	private long animationStartNanos;
	private long animationDurationNanos;

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

		startWidth = currentWidth;
		targetWidth = isExpanding ? JDmainMenu.MENU_WIDTH : 0;
		int distance = Math.abs(targetWidth - startWidth);
		animationDurationNanos = Math.max(1L,
				(long) ((distance / (double) JDmainMenu.MENU_WIDTH) * ANIMATION_DURATION_MS * 1_000_000L));
		animationStartNanos = System.nanoTime();

		if (isExpanding && !jDmainMenu.isVisible()) {
			jDmainMenu.setWidth(Math.max(1, currentWidth));
			jDmainMenu.setVisible(true);
		}

		if (!animationTimer.isRunning()) {
			animationTimer.start();
		}
	}

	private void stepAnimation() {
		updateMenuLocation();

		double progress = (System.nanoTime() - animationStartNanos) / (double) animationDurationNanos;
		double t = Math.min(1.0, Math.max(0.0, progress));

		currentWidth = (int) Math.round(startWidth + (targetWidth - startWidth) * t);

		if (t >= 1.0) {
			currentWidth = targetWidth;
			animationTimer.stop();
			if (currentWidth == 0) {
				jDmainMenu.setVisible(false);
				jDmainMenu.setWidth(0);
			} else {
				jDmainMenu.setWidth(currentWidth);
			}
			return;
		}

		jDmainMenu.setWidth(Math.max(1, currentWidth));
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
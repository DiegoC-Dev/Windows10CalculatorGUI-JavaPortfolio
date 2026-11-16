package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import general.HandlerLanguage;
import utilities.Utilities;

public class JDmainMenu extends JDialog {
	public static final int MENU_WIDTH = 220;
	public static final int MENU_HEIGHT = 400;

	private int x;
	private int y;
	private int width;
	private JPanel menuPanel;

	private JButton jLCalculator;
	private JButton jLStandart;
	private JButton jLCientific;
	private JButton jLProgrammer;
	private JButton jLDate_calculation;
	private JButton jLConverter;
	private JButton jLBadge;
	private JButton jLVolumen;
	private JButton jLLength;
	private JButton jLWeight_and_mass;

	public JDmainMenu(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 0;

		setUndecorated(true);
		setFocusableWindowState(false);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Utilities.mainColor());
		setBackground(Utilities.mainColor());
		setSize(0, MENU_HEIGHT);
		setLocation(x, y);

		menuPanel = new JPanel(new GridLayout(10, 1));
		menuPanel.setBackground(Utilities.mainColor());
		menuPanel.setPreferredSize(new Dimension(MENU_WIDTH, MENU_HEIGHT));
		menuPanel.setBounds(-MENU_WIDTH, 0, MENU_WIDTH, MENU_HEIGHT);
		getContentPane().add(menuPanel);

		initComponents();
	}

	private JButton createMenuButton(String text, Font font) {
		JButton button = new JButton(text);
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setForeground(Utilities.mainLetterColor());
		button.setBackground(Utilities.mainColor());
		button.setBorder(new EmptyBorder(0, 14, 0, 10));
		button.setFont(font);
		button.setFocusPainted(false);
		button.setOpaque(true);
		menuPanel.add(button);
		return button;
	}

	private void initComponents() {
		jLCalculator = createMenuButton(ConstantsGUI.CALCULATOR, Utilities.mediumBoldLetter());
		jLStandart = createMenuButton(ConstantsGUI.STANDARD, Utilities.mediumLetter());
		jLCientific = createMenuButton(ConstantsGUI.CIENTIFIC, Utilities.mediumLetter());
		jLProgrammer = createMenuButton(ConstantsGUI.PROGRAMMER, Utilities.mediumLetter());
		jLDate_calculation = createMenuButton(ConstantsGUI.DATE_CALCULATION, Utilities.mediumLetter());
		jLConverter = createMenuButton(ConstantsGUI.CONVERTER, Utilities.mediumBoldLetter());
		jLBadge = createMenuButton(ConstantsGUI.BADGE, Utilities.mediumLetter());
		jLVolumen = createMenuButton(ConstantsGUI.VOLUMEN, Utilities.mediumLetter());
		jLLength = createMenuButton(ConstantsGUI.LENGTH, Utilities.mediumLetter());
		jLWeight_and_mass = createMenuButton(ConstantsGUI.WEIGHT_AND_MASS, Utilities.mediumLetter());
	}

	public void setMenuLocation(int x, int y) {
		this.x = x;
		this.y = y;
		setLocation(x, y);
	}

	public void setX(int x) {
		setMenuLocation(x, this.y);
	}

	public void setY(int y) {
		setMenuLocation(this.x, y);
	}

	public void changeLanguage() {
		jLCalculator.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.CALCULATOR));
		jLStandart.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.STANDARD));
		jLCientific.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.CIENTIFIC));
		jLProgrammer.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.PROGRAMMER));
		jLDate_calculation.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.DATE_CALCULATION));
		jLConverter.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.CONVERTER));
		jLBadge.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.BADGE));
		jLVolumen.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.VOLUMEN));
		jLLength.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.LENGTH));
		jLWeight_and_mass.setText(HandlerLanguage.languageProperties.getProperty("" + ConstantsGUI.WEIGHT_AND_MASS));
	}

	public void setWidth(int width) {
		int clampedWidth = Math.max(0, Math.min(MENU_WIDTH, width));
		this.width = clampedWidth;
		if (clampedWidth == 0) {
			menuPanel.setBounds(-MENU_WIDTH, 0, MENU_WIDTH, MENU_HEIGHT);
			setSize(0, MENU_HEIGHT);
			return;
		}
		setSize(clampedWidth, MENU_HEIGHT);
		menuPanel.setBounds(clampedWidth - MENU_WIDTH, 0, MENU_WIDTH, MENU_HEIGHT);
		menuPanel.revalidate();
		repaint();
	}

	@Override
	public int getWidth() {
		return width;
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import general.HandlerLanguage;
import utilities.Utilities;

//public class JDmainMenu extends JFrame{
public class JDmainMenu extends JDialog{
//	private static String [] BUTTONS_CONTEN= {ConstantsGUI.CALCULATOR,ConstantsGUI.STANDARD,
//			ConstantsGUI.CIENTIFIC,ConstantsGUI.PROGRAMMER,
//			ConstantsGUI.DATE_CALCULATION,ConstantsGUI.CONVERTER,ConstantsGUI.BADGE,
//			ConstantsGUI.VOLUMEN,ConstantsGUI.LENGTH,ConstantsGUI.WEIGHT_AND_MASS};
	private int x;
	private int y;
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
	private int width;
	public JDmainMenu(int x, int y) {
		setLocation(x+3, y+64);
		width = 220;
//		setBackground(Utilities.mainColor());
		setSize(width,400);
//		setSize(0,400);
		setUndecorated(true);
		this.setBackground(Utilities.mainColor());
		setLayout(new GridLayout(10,1));
		jLCalculator = new JButton();
		jLStandart = new JButton();
		jLCientific = new JButton();
		jLProgrammer = new JButton();
		jLDate_calculation = new JButton();
		jLConverter = new JButton();
		jLBadge = new JButton();
		jLVolumen = new JButton();
		jLLength = new JButton();
		jLWeight_and_mass = new JButton();
		initComponents();
//	 	setVisible(true);
	}
	private void initComponents() {
		jLCalculator.setLayout(new BorderLayout());
		jLCalculator.setBackground(Utilities.mainColor());
		jLCalculator.setText(ConstantsGUI.CALCULATOR);
		jLCalculator.setForeground(Utilities.mainLetterColor());
		jLCalculator.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLCalculator.setFont(Utilities.mediumBoldLetter());
		this.add(jLCalculator);			

		jLStandart.setLayout(new BorderLayout());
		jLStandart.setText(ConstantsGUI.STANDARD);
		jLStandart.setForeground(Utilities.mainLetterColor());
		jLStandart.setBackground(Utilities.mainColor());
		jLStandart.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLStandart.setFont(Utilities.mediumLetter());
		this.add(jLStandart);			

		jLCientific.setLayout(new BorderLayout());
		jLCientific.setText(ConstantsGUI.CIENTIFIC);
		jLCientific.setForeground(Utilities.mainLetterColor());
		jLCientific.setBackground(Utilities.mainColor());
		jLCientific.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLCientific.setFont(Utilities.mediumLetter());
		this.add(jLCientific);			

		jLProgrammer.setLayout(new BorderLayout());
		jLProgrammer.setText(ConstantsGUI.PROGRAMMER);
		jLProgrammer.setForeground(Utilities.mainLetterColor());
		jLProgrammer.setBackground(Utilities.mainColor());
		jLProgrammer.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLProgrammer.setFont(Utilities.mediumLetter());
		this.add(jLProgrammer);			
		
		jLDate_calculation.setLayout(new BorderLayout());
		jLDate_calculation.setText(ConstantsGUI.DATE_CALCULATION);
		jLDate_calculation.setForeground(Utilities.mainLetterColor());
		jLDate_calculation.setBackground(Utilities.mainColor());
		jLDate_calculation.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLDate_calculation.setFont(Utilities.mediumLetter());
		this.add(jLDate_calculation);			

		jLConverter.setLayout(new BorderLayout());
		jLConverter.setText(ConstantsGUI.CONVERTER);
		jLConverter.setForeground(Utilities.mainLetterColor());
		jLConverter.setBackground(Utilities.mainColor());
		jLConverter.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLConverter.setFont(Utilities.mediumBoldLetter());
		this.add(jLConverter);			

		jLBadge.setLayout(new BorderLayout());
		jLBadge.setText(ConstantsGUI.BADGE);
		jLBadge.setForeground(Utilities.mainLetterColor());
		jLBadge.setBackground(Utilities.mainColor());
		jLBadge.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLBadge.setFont(Utilities.mediumLetter());
		this.add(jLBadge);			

		jLVolumen.setLayout(new BorderLayout());
		jLVolumen.setText(ConstantsGUI.VOLUMEN);
		jLVolumen.setForeground(Utilities.mainLetterColor());
		jLVolumen.setBackground(Utilities.mainColor());
		jLVolumen.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLVolumen.setFont(Utilities.mediumLetter());
		this.add(jLVolumen);			

		jLLength.setLayout(new BorderLayout());
		jLLength.setText(ConstantsGUI.LENGTH);
		jLLength.setForeground(Utilities.mainLetterColor());
		jLLength.setBackground(Utilities.mainColor());
		jLLength.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLLength.setFont(Utilities.mediumLetter());
		this.add(jLLength);			

		jLWeight_and_mass.setLayout(new BorderLayout());
		jLWeight_and_mass.setText(ConstantsGUI.WEIGHT_AND_MASS);
		jLWeight_and_mass.setForeground(Utilities.mainLetterColor());
		jLWeight_and_mass.setBackground(Utilities.mainColor());
		jLWeight_and_mass.setBorder(new RoundedBorder(0, Utilities.mainColor()));
		jLWeight_and_mass.setFont(Utilities.mediumLetter());
		this.add(jLWeight_and_mass);			

//		for (int i = 0; i < 10; i++) {
//			jButton = new JButton();
//			jButton.setLayout(new BorderLayout());
//			jButton.setText(BUTTONS_CONTEN[i]);
//			jButton.setForeground(Utilities.mainLetterColor());
//			jButton.setBackground(Utilities.mainColor());
//			jButton.setBorder(new RoundedBorder(0, Utilities.mainColor()));
//			jButton.setFont(i==0 | i==5 ?Utilities.mediumBoldLetter():Utilities.mediumLetter());
//			this.add(jButton);			
//		}
	}
	public void setX(int x) {
//		setLocation(x-12, y+24);
		setLocation(x+3, y+64);
		this.x = x;
	}
	public void setY(int y) {
//		setLocation(x-12, y+24);
		setLocation(x+3, y+64);
		this.y = y;
	}
	public  void changeLanguage(){
		jLCalculator.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.CALCULATOR));
		jLStandart.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.STANDARD));
		jLCientific.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.CIENTIFIC));
		jLProgrammer.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.PROGRAMMER));
		jLDate_calculation.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.DATE_CALCULATION));
		jLConverter.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.CONVERTER));
		jLBadge.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.BADGE));
		jLVolumen.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.VOLUMEN));
		jLLength.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.LENGTH));
		jLWeight_and_mass.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.WEIGHT_AND_MASS));
	}
	public void setWidth(int width){
		this.width= width;
		setSize(width, 400);
	}
	public int getWidth() {
		return width;
	}
}

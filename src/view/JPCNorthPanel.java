package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.geom.Point2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.DimensionUIResource;

import general.HandlerLanguage;
import utilities.Utilities;

public class JPCNorthPanel extends JPanel{
	private static String [] BUTTONS_SOUTH_CONTEN= {"MC","MR","M+","M-","MS","M'"};
	GradientButton standartButton;
	JLabel standart;
	JPanel jPNorthPanel;
	JPanel jPNWestPanel;
	JPanel jPanelAux;
	JPanel jPNCenterPanel;
	JPanel jPSouthPanel;
	JPanel jPCenterPanel;
	JButton jButton;
	JLabel screen;
	public JPCNorthPanel() {
		setLayout(new BorderLayout());
		setPreferredSize(new DimensionUIResource(0, 164));
		initComponents();
	}
	private void initComponents() {
		jPNorthPanel = new JPanel();
		jPNorthPanel.setLayout(new BorderLayout());
		jPNorthPanel.setBackground(Color.MAGENTA);
		jPNorthPanel.setPreferredSize(new Dimension(50, 50));
		
			jPNWestPanel = new JPanel();
			jPNWestPanel.setLayout(new BorderLayout());
			jPNWestPanel.setBackground(Utilities.mainColor());
			jPNWestPanel.setPreferredSize(new Dimension(50, 50));
			
				jPanelAux = new JPanel();
				jPanelAux.setBackground(Utilities.mainColor());
//				jPanelAux.setBackground(Color.cyan);
				jPanelAux.setPreferredSize(new Dimension(12,0));
				jPNWestPanel.add(jPanelAux,BorderLayout.WEST);
				
				jPanelAux = new JPanel();
				jPanelAux.setBackground(Utilities.mainColor());
				jPanelAux.setPreferredSize(new Dimension(0,19));
				jPNWestPanel.add(jPanelAux,BorderLayout.NORTH);
				
				jPanelAux = new JPanel();
				jPanelAux.setBackground(Utilities.mainColor());
				jPanelAux.setPreferredSize(new Dimension(19,0));
				jPNWestPanel.add(jPanelAux,BorderLayout.EAST);
				
				jPanelAux = new JPanel();
				jPanelAux.setBackground(Utilities.mainColor());
				jPanelAux.setPreferredSize(new Dimension(0,19));
				jPNWestPanel.add(jPanelAux,BorderLayout.SOUTH);
					standartButton = new GradientButton();
					standartButton.setBorder(new RoundedBorder(0, Utilities.mainColor()));
					jPNWestPanel.add(standartButton,BorderLayout.CENTER);
					
			jPNorthPanel.add(jPNWestPanel,BorderLayout.WEST);
			
			jPNCenterPanel = new JPanel();
			jPNCenterPanel.setLayout(new BorderLayout());
			jPNCenterPanel.setBackground(Color.black);
				standart = new JLabel(ConstantsGUI.STANDARD);
				standart.setForeground(Utilities.mainLetterColor());
				standart.setFont(Utilities.mediumBoldLetter());
				jPNCenterPanel.add(standart,BorderLayout.WEST);
			jPNorthPanel.add(jPNCenterPanel,BorderLayout.CENTER);

		this.add(jPNorthPanel,BorderLayout.NORTH);
		jPSouthPanel = new JPanel();
		jPSouthPanel.setPreferredSize(new Dimension(0, 25));
		jPSouthPanel.setLayout(new GridLayout());
		jPSouthPanel.setBackground(Utilities.mainColor());
		for (int i = 0; i < 6; i++) {
			jButton = new JButton();
			jButton.setFont(Utilities.smallLetter());
			jButton.setBackground(Utilities.mainColor());
			jButton.setBorder(new RoundedBorder(0, Utilities.mainColor()));
			jButton.setForeground(i==0 || i==1 || i==5 ?Utilities.grayColor():Utilities.mainLetterColor());
			jButton.setText(BUTTONS_SOUTH_CONTEN[i]);
			jPSouthPanel.add(jButton);
		}
		this.add(jPSouthPanel,BorderLayout.SOUTH);
		
		jPCenterPanel = new JPanel();
		jPCenterPanel.setLayout(new BorderLayout());
		jPCenterPanel.setBackground(Utilities.mainColor());
			screen =  new JLabel("12 ");
			screen.setFont(Utilities.screenLetter());
			screen.setForeground(Utilities.mainLetterColor());								
			screen.setHorizontalAlignment(SwingConstants.RIGHT);
			screen.setVerticalAlignment(SwingConstants.CENTER);
			jPCenterPanel.add(screen,BorderLayout.CENTER);
		this.add(jPCenterPanel,BorderLayout.CENTER);
	}
	public  void changeLanguage(){
		standart.setText(HandlerLanguage.languageProperties.getProperty(ConstantsGUI.STANDARD));
		standartButton.changeLanguage();
//		labelColor1.setText(HandlerLanguage.languageProperties.getProperty(ConstantsGUI.SELECT_COLOR_1));
//		labelColor2.setText(HandlerLanguage.languageProperties.getProperty(ConstantsGUI.SELECT_COLOR_2));
//		labelColor3.setText(HandlerLanguage.languageProperties.getProperty(ConstantsGUI.SELECT_COLOR_3));
//		acceptButton.setText(HandlerLanguage.languageProperties.getProperty(ConstantsGUI.ACCEPT));
//		cancelButton.setText(HandlerLanguage.languageProperties.getProperty(ConstantsGUI.CANCEL));
	}
	public void sendCoordinates(Point point2d) {
		standartButton.sendCoordinates(point2d);
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import utilities.Utilities;

public class JPCSouthPanel extends JPanel{
	private static String [][] BUTTONS_CONTEN= {{"CE","C","x","÷"},
			{"7","8","9","X"},
			{"4","5","6","-"},
			{"1","2","3","+"},
			{"±","0",".","="}}; 
	JPanel jPanelAux;
	JButton jButton;
	public JPCSouthPanel() {
		setBackground(Utilities.secundaryColor());
//		setBackground(Color.green);
		setLayout(new GridLayout(5,4));
		setPreferredSize(new DimensionUIResource(0, 233));
		initComponents();
	}
	private void initComponents() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				jButton = new JButton();
//				jButton.setForeground(Utilities.whaitColor());	
//				jButton.setBackground(Utilities.mainColorGray());
				jButton.setBorder(new RoundedBorder(0,Utilities.secundaryColor()));
				jButton.setFont(i==0 || j==3 || i==4 && j==0 || i==4 && j==2?
						Utilities.bigPlainLetter():Utilities.bigBoldLetter());
				if(i==0 && j==0 || i==0 && j==1) {
					jButton.setFont(Utilities.mediumLetter());
				}
				jButton.setText(BUTTONS_CONTEN[i][j]);
				jButton.setBackground(Utilities.secundaryColor());
				jButton.setForeground(Utilities.mainLetterColor());	
				this.add(jButton);
			}
		}
//		jPanelAux = new JPanel();
//		this.add(jPanelAux)
	}
}

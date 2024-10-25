package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.activation.MailcapCommandMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import general.HandlerLanguage;
import utilities.Utilities;

public class JPEastPanel extends JPanel{
	JPanel jPWestPanel;
	JPanel jPNorthPanel;
	JPanel jPCenterPanel;
	JPanel jPSouthPanel;
//	JButton memoryjLabel;
//	JButton historyjLabel;
//	JButton informationLabel;
	JLabel memoryjLabel;
	JLabel historyjLabel;
	JLabel informationLabel;
	JPanel jPanelAux;
	JPanel jPanelAuxEast;
	JPanel jPanelAuxWest;
	public JPEastPanel() {
		setBackground(Utilities.mainColor());
		setLayout(new BorderLayout());
		jPWestPanel = new JPanel();
		jPWestPanel.setLayout(new BorderLayout());
		jPWestPanel.setPreferredSize(new Dimension(1,0));
		jPWestPanel.setBackground(Utilities.secundaryColor());
		this.add(jPWestPanel,BorderLayout.WEST);
		
		jPanelAux = new JPanel();
		jPanelAux.setLayout(new BorderLayout());
		jPanelAux.setBackground(Color.magenta);	
		
			jPNorthPanel = new JPanel();
			jPNorthPanel.setBackground(Utilities.mainColor());
			jPNorthPanel.setLayout(new BorderLayout());
			jPNorthPanel.setPreferredSize(new Dimension(0,50));
			
				jPanelAuxWest = new JPanel();
				jPanelAuxWest.setBackground(Utilities.mainColor()); 
				jPanelAuxWest.setPreferredSize(new Dimension(11,0));
				jPNorthPanel.add(jPanelAuxWest,BorderLayout.WEST);
			
//				historyjLabel = new JButton("   "+ConstantsGUI.HISTORY);
				historyjLabel = new JLabel(""+ConstantsGUI.HISTORY);
				historyjLabel.setBackground(Utilities.mainColor());
//				historyjLabel.setBorder(new RoundedBorder(0, Color.blue));
//				historyjLabel.setHorizontalAlignment(SwingConstants.RIGHT);
				historyjLabel.setFont(Utilities.smallBoldLetter());
//				historyjLabel.setPreferredSize(new Dimension(2,0));
				historyjLabel.setForeground(Utilities.mainLetterColor());								
			
				jPNorthPanel.add(historyjLabel,BorderLayout.CENTER);
			
				memoryjLabel = new JLabel("   "+ConstantsGUI.MEMORY);
//				memoryjLabel.setBorder(new RoundedBorder(0, Color.red));

//				memoryjLabel = new JButton(""+ConstantsGUI.MEMORY);
				memoryjLabel.setPreferredSize(new Dimension(142,0));
//				memoryjLabel.setHorizontalAlignment(SwingConstants.CENTER);
				memoryjLabel.setBackground(Utilities.mainColor());
				memoryjLabel.setFont(Utilities.smallBoldLetter());
				memoryjLabel.setForeground(Utilities.grayColor());		
			
				jPNorthPanel.add(memoryjLabel,BorderLayout.EAST);
				
			
			jPanelAux.add(jPNorthPanel,BorderLayout.NORTH);
			
			jPCenterPanel = new JPanel();
			jPCenterPanel.setBackground(Utilities.mainColor());
			jPCenterPanel.setLayout(new BorderLayout());
				
				jPanelAuxWest = new JPanel();
				jPanelAuxWest.setPreferredSize(new Dimension(11,0));
				jPanelAuxWest.setBackground(Utilities.mainColor());
				jPCenterPanel.add(jPanelAuxWest,BorderLayout.WEST);

				informationLabel = new JLabel(""+ConstantsGUI.MESSAGE);
//				informationLabel.setHorizontalAlignment(SwingConstants.);

//			informationLabel = new JLabel("   "+ConstantsGUI.THERE_IS+ConstantsGUI.NO+
//					ConstantsGUI.HISTORY+ConstantsGUI.YET);
//			informationLabel = new JButton("   "+ConstantsGUI.THERE_IS+ConstantsGUI.NO+
//					ConstantsGUI.HISTORY+ConstantsGUI.YET);
//				informationLabel = new JLabel("   "+Utilities.message());
				informationLabel.setFont(Utilities.infoLetter());
				informationLabel.setForeground(Utilities.mainLetterColor());
				jPCenterPanel.add(informationLabel,BorderLayout.CENTER);
				
	
			jPanelAux.add(jPCenterPanel,BorderLayout.CENTER);
			
			jPSouthPanel = new JPanel();
			jPSouthPanel.setPreferredSize(new Dimension(0,360));
			jPSouthPanel.setBackground(Utilities.mainColor());
			jPanelAux.add(jPSouthPanel,BorderLayout.SOUTH);
			
		this.add(jPanelAux,BorderLayout.CENTER);
	}
	public  void changeLanguage(){
		memoryjLabel.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.MEMORY));
		historyjLabel.setText(HandlerLanguage.languageProperties.getProperty(""+ConstantsGUI.HISTORY));
		informationLabel.setText(HandlerLanguage.languageProperties.getProperty(ConstantsGUI.MESSAGE));
	}
}
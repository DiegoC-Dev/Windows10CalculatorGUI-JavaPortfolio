package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

public class JPCenterPanel extends JPanel{
	JPCCenterPanel jPCCenterPanel;
	JPCSouthPanel jPCSouthPanel;
	JPCNorthPanel jPCNorthPanel; 
	
	public JPCenterPanel() {
		setBackground(Color.blue);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(302, 0));
		initComponent();
	}

	private void initComponent() {
		jPCNorthPanel = new JPCNorthPanel();
		this.add(jPCNorthPanel,BorderLayout.NORTH);
		jPCCenterPanel = new JPCCenterPanel();
		this.add(jPCCenterPanel,BorderLayout.CENTER);
		jPCSouthPanel = new JPCSouthPanel();
		this.add(jPCSouthPanel,BorderLayout.SOUTH);
	}
	public void changeLanguage(){
		jPCNorthPanel.changeLanguage();
	}
	public void sendCoordinates(Point point2d) {
		jPCNorthPanel.sendCoordinates(point2d);
	}

}

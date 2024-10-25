package view;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.geom.Point2D;

import javax.swing.JFrame;

public class JFmainFrame extends JFrame{
	JPCenterPanel jPCenterPanel;
	JPEastPanel jPEastPanel;
	public JFmainFrame() {
//		setLocationRelativeTo(this);
		setSize(540, 470);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponenets();
		setVisible(true);
	}
	private void initComponenets() {
		jPCenterPanel = new JPCenterPanel();
		this.add(jPCenterPanel,BorderLayout.WEST);
		jPEastPanel = new JPEastPanel();
		this.add(jPEastPanel,BorderLayout.CENTER);
	}
	public void changeLanguage(){
		jPCenterPanel.changeLanguage();
		jPEastPanel.changeLanguage();
	}
	public void sendCoordinates(Point point2d) {
		jPCenterPanel.sendCoordinates(point2d);
	}
}
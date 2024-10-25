package view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;

import javax.swing.JButton;
import javax.swing.JDialog;

import org.w3c.dom.events.MouseEvent;

public class GradientButton extends JButton implements ActionListener ,MouseListener{
	private JDmainMenu jDmainMenu;
	private int clicks;
	private Point location;
	public GradientButton() {
		clicks = 1;
		setBackground(Color.black);
	 	this.addActionListener(this);
//	 	reposition();
	 	location = getLocation();
	 	jDmainMenu = new JDmainMenu(0, 0);
//	 	jDmainMenu = new JDmainMenu(getX(), getY());
	}
	private Color color1 = Color.black;
	private Color color2 = Color.white;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        for (int i = 0; i < 11; i++) {
        	g2.setColor(i==3 || i==4 || i==7 || i==8?color1:color2);
        	g2.drawLine(0, i, getWidth(), i);
		}
        g2.drawLine(0, 11, getWidth(), 11);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		clicks=clicks+1;
//		updateLocation();
		jDmainMenu.setVisible(true);
		try {
			if(clicks%2==0) {
				for (int i = 0; i < 220; i++) {
					jDmainMenu.setX(location.x);
					jDmainMenu.setY(location.y);
					Thread.sleep(6);
					jDmainMenu.setWidth(i);
				}	
			}
			if(clicks%2!=0) {
				for (int i = 220; i > 0; i--) {
					jDmainMenu.setX(location.x);
					jDmainMenu.setY(location.y);
					Thread.sleep(5);
					jDmainMenu.setWidth(i);
				}
			}
//			System.out.println("asdad");
//			jFmainFrame.setHeight(200);
		} catch (InterruptedException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
	private void updateLocation(){
//		location = getLocationOnScreen();
//		location = sendCoordinates(point2d);
		jDmainMenu.setX(location.x);
		jDmainMenu.setY(location.y);
	}
//	private void reposition() {
//		Thread thread = new Thread(new Runnable() {
//			boolean init  = true;
//			int cont =0;
//			@Override
//			public void run() {
//				while (init==true) {
//					repaint();
//					jDmainMenu = new JDmainMenu(getX(), getY());
//				}
////				System.out.println(cont);
//////				updateLocation();
////					if(visivility ==true) {
////						jDmainMenu.setSize(cont, 400);
////						cont= cont +1;					
////					}
////				}
//			}
//		});
//		thread.start();
//	}
	public void changeLanguage(){
		jDmainMenu.changeLanguage();
	}
	public void sendCoordinates(Point point2d) {
//		standartButton.sendCoordinates(point2d);
		location=point2d;
		jDmainMenu.setX(location.x);
		jDmainMenu.setY(location.y);
//		System.out.println("sdf");
		
//		return point2d;
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		System.out.println("1");
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		System.out.println("2");
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("4");
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("5");
	}
}
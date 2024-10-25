package controller;

import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Point2D;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import general.HandlerLanguage;
import view.JFmainFrame;
//import view.JDmainMenu;
import view.JPCNorthPanel;

public class Control {
	private static final String NAME_FILE_CONFIG = "resources/config.init";
	private HandlerLanguage config = null;
	JFmainFrame jFmainFrame;
	public Control() {
//		initLookAndFeel();
		jFmainFrame = new JFmainFrame();
		pruebaListen();
		assignLanguage();
	}
	
	private void pruebaListen() {
		jFmainFrame.addComponentListener(new ComponentAdapter() {
			int x=0;
			int y=0;
		@Override
		public void componentMoved(ComponentEvent e) {
			// TODO Auto-generated method stub
			super.componentMoved(e);
//			System.out.println(jFmainFrame.getLocationOnScreen().getX());
			x=(int) jFmainFrame.getLocationOnScreen().getX(); 
			y=(int) jFmainFrame.getLocationOnScreen().getY(); 
			sendCoordinates(new Point(x, y));
		}
		});
	}
	private void sendCoordinates(Point point2d) {
		jFmainFrame.sendCoordinates(point2d);
	}

	private void initLookAndFeel() {
		String lookAndFeel = "javax.swing.plaf.synth.SynthLookAndFeel";
        	
        	try {
				UIManager.setLookAndFeel(lookAndFeel);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            JFrame.setDefaultLookAndFeelDecorated(true);				
    }
	public void loadConfiguration(){
		if(config == null){
			config = new HandlerLanguage(NAME_FILE_CONFIG);
		}
		//
		try{
			config.loadLanguage();
//			assignDefaultPropeties();
		}catch(IOException e){
			System.err.println("file not found : NAME_FILE_CONFIG");
		}
	}
	private void manageChangeLanguageUS(){
		try {
			changeToEnglish();
		} catch (IOException e1) {
			e1.printStackTrace();
		}			
		manageChangeLanguage();
	}
	private void manageChangeLanguageES(){
		try {
			changeToSpanish();
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		manageChangeLanguage();
	}
	public void changeToEnglish() throws IOException{
		HandlerLanguage.language = "resources/languageUS.properties";
		saveConfig();
		loadLanguage();		
	}
	public void changeToSpanish() throws IOException{
		HandlerLanguage.language = "resources/languageES.properties";
		saveConfig();
		loadLanguage();
	}
	public void saveConfig() throws IOException{
		try {
			new HandlerLanguage(NAME_FILE_CONFIG).saveLanguage();
		} 
		catch (Exception e) {
		}
	}
	public void loadLanguage() throws IOException{
		try {
			config.loadLanguage();
		} catch (Exception e) {			
		}
	}
	private void manageChangeLanguage(){
//		jFmainFram.changeLanguage();	
		jFmainFrame.changeLanguage();
//		jMpopupMenu.changeLanguage();
	}
	private void assignLanguage() {
		loadConfiguration();
		manageChangeLanguage();
		if (System.getProperty("user.language").equals("es")) {
			manageChangeLanguageES();
		}
		else
			manageChangeLanguageUS();						
	}
}

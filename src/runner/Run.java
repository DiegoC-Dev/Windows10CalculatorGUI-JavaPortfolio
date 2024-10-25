package runner;

import javax.swing.JFrame;

import controller.Control;

public class Run {
	public static void main(String[] args) {
//		JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoracion ( por asi decirlo)
//		SubstanceLookAndFeel.setSkin(“org.jvnet.substance.skin.CremeSkin”); // Setencia que aplica el skin Creme de Substance
		new Control();
	}
}

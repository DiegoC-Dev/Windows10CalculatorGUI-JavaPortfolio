package utilities;

import java.awt.Color;
import java.awt.Font;

public class Utilities {
	private static String font = "Arial";
	
	public Utilities() {
	}
	public static Color mainColor() {
		return Color.black;
	}
	public static Color grayColor() {
		return Color.gray;
	}
	public static Color secundaryColor() {
		return new Color(31,31,31);
	}
	public static Color mainLetterColor() {
		return Color.white;
	}
	public static Color whaitColor() {
		return Color.white;
	}
	public static Color blackColor() {
		return Color.black;
	}
	public static Color blueLetter() {
		return new Color(30, 57, 91);
	}
	public static Color grayLetter() {
		return Color.gray;
	}
	public static Font veryLargeLetter() {
		return new Font("Gresa", 0, 20);
	}
	public static Font bigPlainLetter() {
//		return new Font("Gresa", 0, 15);
		return new Font(font, Font.PLAIN, 16);
	}
	public static Font bigBoldLetter() {
		return new Font(font, Font.BOLD, 16);
	}

	public static Font screenLetter() {
		return new Font(font, Font.BOLD, 38);
//		return new Font("Gresa", 0, 20);
	}
	public static Font smallLetter() {
		return new Font(font, 0, 9);
//		return new Font("Gresa", 0, 10);
	}
	public static Font infoLetter() {
		return new Font(font, 0, 11);
//		return new Font("Gresa", 0, 10);
	}
	public static Font smallBoldLetter() {
		return new Font(font, Font.BOLD, 11);
	}
	public static Font mediumLetter() {
		return new Font(font, 0, 13);
//		return new Font("Gresa", 0, 11);
	}
	public static Font mediumBoldLetter() {
		return new Font(font, Font.BOLD, 13);
//		return new Font("Gresa", 0, 11);
	}
	public static int spacing() {
		return 3;
	}
	public static int spacing2() {
		return 8;
	}
	public static String message() {
		return "There's no history yet";
	}
}

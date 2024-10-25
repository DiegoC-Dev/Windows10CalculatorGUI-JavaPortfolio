package general;

import java.io.IOException;
import java.util.Properties;

public class HandlerLanguage {
	public String fileName;
	public static String language = "undefined";
	public static Properties languageProperties;
	public static String fillColor ="#CFB6B1";
	public static String outlinedColor ="#CFB6B1";
	public static String extraDetailColor ="#CFB6B1";
	public static String numberFigures= "6" ;
	
	public HandlerLanguage(String fileName){
		this.fileName = fileName;
	}
	
	public void loadLanguage() throws IOException{		
		HandlerProperties handlerproperties = new HandlerProperties(fileName);
		handlerproperties.load();
		language = handlerproperties.getProperty("Language");
		fillColor = handlerproperties.getProperty("Color1");
		outlinedColor = handlerproperties.getProperty("Color2");
		extraDetailColor = handlerproperties.getProperty("Color3");
//		System.out.println("asignamos nombre");
//		System.out.println("miramos que contine..."+handlerproperties.getProperty("NumberFigures"));
		numberFigures = handlerproperties.getProperty("NumberFigures");
//		System.out.println("asignamos numbrefig = "+numberFigures);
		
		HandlerProperties handlerLanguageProperties = new HandlerProperties(language);
		handlerLanguageProperties.load();
		languageProperties = handlerLanguageProperties;
	}
	
	public void saveLanguage() throws IOException{
		HandlerProperties handlerproperties = new HandlerProperties(fileName);
		handlerproperties.load();
		handlerproperties.setProperty("Language", language);
		handlerproperties.setProperty("Color1", fillColor);
		handlerproperties.setProperty("Color2", outlinedColor);
		handlerproperties.setProperty("Color3", extraDetailColor);
		handlerproperties.setProperty("NumberFigures", numberFigures);
		handlerproperties.save();
	}	
}
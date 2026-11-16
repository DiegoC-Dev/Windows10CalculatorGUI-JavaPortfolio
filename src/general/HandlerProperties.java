package general;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HandlerProperties extends Properties {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fileName;
	
	public HandlerProperties(String fileName) throws IOException{
		this.fileName = fileName;
	}
	
	public void load() throws IOException{
		File file = new File(fileName);
		if (!file.exists()) {
			file = new File("/app/" + fileName);
		}
		InputStream input = new FileInputStream(file);
		load(input);
		input.close();
	}	
	
	public void save() throws IOException{
		try {
			FileOutputStream output = new FileOutputStream(fileName);
			store(output, null);
			output.close();
		} catch (IOException e) {
			// Ignore write errors in read-only browser filesystem
		}
	}
}
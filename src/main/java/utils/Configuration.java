package utils;

import java.io.InputStream;
import java.util.Properties;


public class Configuration {
	
	Properties properties;
	
	public Configuration() {
		loadProperties();
	}

	private void loadProperties() {
		try {
		properties = new Properties();
		InputStream iStream = getClass().getClassLoader() .getResourceAsStream("configuration.properties");
		properties.load(iStream);
		
	}catch (Exception e) {
		e.printStackTrace();
		
	}

}
	public String getProp (String key) {
		return properties.getProperty(key);
		
	}
	public int getPropN(String key) {
		return Integer.parseInt(getProp(key));
	}
}


package com.fis.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {

	public static Properties readProp() {
		Properties p = null;
		
		try {
			FileReader fr = new FileReader("config.properties");
			p = new Properties();  
			 p.load(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;  
	}
}

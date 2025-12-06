package com.sis.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	private static Properties prop;

	/**
	 * This method reads the properties of the given config file
	 * 
	 * @param filePath
	 */
	public static void readProperties(String filePath) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Set new property.
	 * @param key
	 * @param value
	 */
	public static void setProperty(String key, String value) {
		prop.setProperty(key, value);
		try {
			FileOutputStream fos = new FileOutputStream(Constants.CONFIGURATION_FILEPATH);
			prop.store(fos, "File has been Updated ["+ key + " : " + value +"]");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method returns the value of the provided key in the config file
	 * @param String key
	 * @return String value
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}

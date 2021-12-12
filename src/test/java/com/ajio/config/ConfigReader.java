package com.ajio.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop;

	public ConfigReader() throws Throwable {
		File file = new File(
				"C:\\Users\\Manimaran\\eclipse-workspace\\Ajio\\src\\test\\java\\com\\ajio\\config\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
	}

	public String getBrowser() {
		String browserName = prop.getProperty("browser");
		return browserName;
	}

	public String getURL() {
		String app_URL = prop.getProperty("url");
		return app_URL;
	}

	public String getUser() {
		String Username = prop.getProperty("user");
		return Username;
	}

	public String getPass() {
		String Password = prop.getProperty("password");
		return Password;
	}

}

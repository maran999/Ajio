package com.ajio.config;

public class File_Reader_Manger {
	
	private File_Reader_Manger() {
		
	}
	
	public static File_Reader_Manger getInstance() {
		File_Reader_Manger helper= new File_Reader_Manger();
		return helper;

	}
	public ConfigReader getInstanceCR() throws Throwable {
		ConfigReader reader= new ConfigReader();
        return reader;
	}

}

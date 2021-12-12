package com.ajio.config;

import org.openqa.selenium.WebDriver;

import com.aijo.pageObject.LoginAijo;

public class Page_Object_Manager {
	public static WebDriver driver;
	private LoginAijo login;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginAijo getInstanceLogin() {
	    login = new LoginAijo(driver);
         return login;
	}
	
	

}

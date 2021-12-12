package com.aijo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAijo {
	
	public static WebDriver driver;

	@FindBy(className = "login-form")
	private WebElement signin;
	
	@FindBy(className = "username")
	private WebElement username;
	
	@FindBy(className = "login-btn")
	private WebElement sumbit;
	
	@FindBy(xpath = "//input[@value='LOGIN WITH PASSWORD']")
	private WebElement loginWithpass;
	
	@FindBy(id = "pwdInput")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='START SHOPPING']")
	private WebElement startShopping;

	public LoginAijo(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getSumbit() {
		return sumbit;
	}

	public WebElement getLoginWithpass() {
		return loginWithpass;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getStartShopping() {
		return startShopping;
	}
	
}

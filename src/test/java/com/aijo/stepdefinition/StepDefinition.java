package com.aijo.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ajio.baseclass.Base_Class;
import com.ajio.config.File_Reader_Manger;
import com.ajio.config.Page_Object_Manager;
import com.ajio.runner.Runner;

import io.cucumber.java.en.*;

public class StepDefinition extends Base_Class {

	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@Given("user launch the Ajio application")
	public void user_launch_the_ajio_application() throws Throwable {
		String url = File_Reader_Manger.getInstance().getInstanceCR().getURL();
	   getUrl(url);
	}
	@When("user want to click on signin")
	public void user_want_to_click_on_signin() {
	   click(pom.getInstanceLogin().getSignin());
	}
	@When("user enter valid username")
	public void user_enter_valid_username() throws Throwable {
		String user = File_Reader_Manger.getInstance().getInstanceCR().getUser();
	   sendKeys(pom.getInstanceLogin().getUsername(), user);
	}
	@When("user want to click continue")
	public void user_want_to_click_continue() {
	   click(pom.getInstanceLogin().getSumbit());
	}
	@When("user want to click on login with password")
	public void user_want_to_click_on_login_with_password() {
	  click(pom.getInstanceLogin().getLoginWithpass());
	}
	@When("user enter valid password")
	public void user_enter_valid_password() throws Throwable {
		String password = File_Reader_Manger.getInstance().getInstanceCR().getPass();
	   sendKeys(pom.getInstanceLogin().getPassword(), password);
	}
	@Then("user click on start shoping")
	public void user_click_on_start_shoping() {
	   click(pom.getInstanceLogin().getStartShopping());
	}


}

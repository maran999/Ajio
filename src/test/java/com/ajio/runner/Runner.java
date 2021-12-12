package com.ajio.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ajio.baseclass.Base_Class;
import com.ajio.config.File_Reader_Manger;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\com\\aijo\\feature"},
                 glue = {"com\\aijo\\stepdefinition"}
		)
public class Runner {
       public static WebDriver driver;
	
    @BeforeClass
	public static void start_browser() throws Throwable {
    String browser = File_Reader_Manger.getInstance().getInstanceCR().getBrowser();
	driver = Base_Class.browserLaunch(browser);

	}
}

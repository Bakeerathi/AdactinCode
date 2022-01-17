package com.adactine;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.helperfile.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import project.assigment.App;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\java\\features",
					glue = "stepDefinition"
		
		)
public class RunnerFile {
	
	public static WebDriver driver;
	
	public static void browser()
	{
		String browserName= File_Reader_Manager.getInstance().getInstanceData().browserName();
		
		driver=App.selectBrowser(browserName);
		System.out.println(browserName);
}
}

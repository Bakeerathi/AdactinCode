package project.assigment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App 
{
  
	public static WebDriver driver;
	
	public static WebDriver selectBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bakee\\eclipse-workspace\\Practise\\WebDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
			
		}
		return driver;
	}
	
	public static void getUrl(String url)
	{
	   driver.get(url);
 
	  
	}
	
	public static void clickable(WebElement element)
		{
		element.click();	
		}
	
	public static void sendValues(WebElement element, String value)
		{
		element.sendKeys(value);
		}	
	
	public static void dropDown(WebElement element ,String type, String value )
		{
		
	Select s= new Select(element);
	if (type.equalsIgnoreCase("byValue"))
	{
		s.selectByValue(value);
	}
	else if(type.equalsIgnoreCase("byIndex"))
	{   
		int i =Integer.parseInt(value);
		s.selectByIndex(i);
	}
	else if(type.equalsIgnoreCase("byVisisbleText"))
	{
		s.selectByVisibleText(value);
	}
		
	
	}
	
}






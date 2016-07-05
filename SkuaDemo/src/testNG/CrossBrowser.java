package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser
{
	WebDriver driver;
	
	@Test
	@Parameters("Browser")
	public void BrowsersTest1(String browser)
	{
		if (browser.equalsIgnoreCase("FF")) 
		{
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile fp=pr.getProfile("Selenium1");
			driver=new FirefoxDriver(fp);
			driver.get("http://www2.creditsafeuk.com/");
				
			
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Test1\\Downloads\\Areef\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www2.creditsafeuk.com/");
			
			
			
		}
		
		
		
	}
	
	
}

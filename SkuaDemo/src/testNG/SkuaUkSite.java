package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SkuaUkSite 
{
	WebDriver driver;
	@BeforeTest
	public void LaunchFFprofile()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Selenium1");
		driver=new FirefoxDriver(fp);
		driver.get("http://www2.creditsafeuk.com/");
		
		
	}
	
@Test
public void test1()
{
	driver.manage().window().maximize();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for (int i = 0; i < links.size(); i++) 
	{
	if (!links.get(i).getText().isEmpty()) 
	{
		String linkname=links.get(i).getText();
		System.out.println(linkname);
		
		
	}		
		
	}
	
	
}	
@AfterTest
public void Closeapp()
{
	driver.quit();
	
}
	
}

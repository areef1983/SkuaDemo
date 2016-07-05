package creditsafe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LaunchApp {

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Selenium1");
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://www2.creditsafeuk.com/");
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

}

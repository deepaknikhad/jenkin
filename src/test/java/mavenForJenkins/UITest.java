package mavenForJenkins;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class UITest 
{
	
	@Test
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	     // driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getTitle().contains("Facebook – log in or sign up"), "Title does not match");
		Thread.sleep(1000);
		driver.quit();
		
	}
	

	/*@Parameters("Browser")
	@Test
	public void startBrowser(String browserName)
	{
		System.out.println("Parameter value is "+browserName);
		WebDriver driver=null;
		
		if(browserName.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--headless");
			opt.addArguments("--no-sandbox");
			opt.addArguments("--disable-dev-shm-usage");
			driver=new ChromeDriver(opt);
		}
		else if(browserName.contains("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
		driver.quit();
	}*/
	
	
	
	
	
}

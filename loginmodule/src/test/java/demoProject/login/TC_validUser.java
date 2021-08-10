package demoProject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_validUser {
	
	@BeforeClass
	public  void username()
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
		if(driver.getTitle().equals("you are on saucedemo"))
		{
		      Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertFalse(false);
		}
		
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");	
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test
	
	public void user1()
	{
		Assert.assertFalse(false);
		System.out.println("user 1 test pass");
		
		
	}
	
	 
	
	
}

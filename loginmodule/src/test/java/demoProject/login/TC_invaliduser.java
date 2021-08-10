package demoProject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_invaliduser {
	@BeforeClass
	public  void username()
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.id("user-name")).sendKeys("standarduser");	
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test
	
	public void user2()
	{
		Assert.assertFalse(true);
		System.out.println("user 2 test fail");
		
		
	}
	
}

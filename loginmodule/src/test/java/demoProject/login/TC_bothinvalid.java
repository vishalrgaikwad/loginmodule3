package demoProject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_bothinvalid {
	@BeforeClass
	public  void username()
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.id("user-name")).sendKeys("Standard_user");	
		driver.findElement(By.id("password")).sendKeys("secretsauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test
	
	public void user3()
	{
		Assert.assertFalse(true);
		System.out.println("user 4 test fail");
		
		
	}
	
}


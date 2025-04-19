package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;




public class Testcase1 {
	// First Test Case Demo 
	
	@Test
   public static void users()
	{

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://in.dev.vibhohcm.com/");
		
		driver.findElement(By.id("username")).sendKeys("DEV");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.className("login-signin")).click();
		driver.close();
		
	}
	
	//second test Demo
	@AfterTest
	public void users2()
	{
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.dev.vibhohcm.com/");
		
		driver.findElement(By.id("username")).sendKeys("dev0123");
		driver.findElement(By.id("password")).sendKeys("1234567890");
		driver.findElement(By.className("login-signin")).click();
		driver.close();
		
	}
}

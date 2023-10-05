package testng1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {
	
	ChromeDriver driver;

	@BeforeMethod
	public void lunchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

	}
	
	@Test(priority = 1)
	public void loginTest() {
		String title = driver.getTitle();
		String expectedTitle = "Swag Labs";
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertEquals(title, expectedTitle);
		
	}
	
	@Test(priority = 2)
	public void logoutTest() {
		//System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		Boolean expectedUrl = url.contains("saucedemo");
		Assert.assertEquals(url, true);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	
}
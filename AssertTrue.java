package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertTrue {

	WebDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
	}
	@Test
	//assertTrue method 
	public void assertEqual () {
		String actualUrl = driver.getCurrentUrl();
		Boolean expected =  actualUrl.contains("webdriveruniversity");
		Assert.assertTrue(expected);

	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

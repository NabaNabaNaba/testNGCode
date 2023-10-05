package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertFalse {

	WebDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
	}
	@Test
	//assertFalse method 
	public void assertEqual () {
		//prog 1
		String actualUrl = driver.getCurrentUrl();
		Boolean expected =  actualUrl.contains("google");//false value expected
		Assert.assertFalse(expected);

		//prog 2
		driver.get("https://www.google.com");
		Boolean falseExpected = driver.getCurrentUrl().contains("university");
		Assert.assertFalse(falseExpected);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

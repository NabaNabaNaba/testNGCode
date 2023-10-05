package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertEquals {
		
	WebDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
	}
	@Test
	//assertEquals method which verify the equals of element value
	public void assertEqual () {
		String actualTitle = driver.getTitle();
		String  expectedTitle = "WebDriverUniversity.com";
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

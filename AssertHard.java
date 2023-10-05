package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertHard {

	WebDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
	}
	@Test
	//HardAssertion will stops after failure of the program and //doesn't run all prog till end
	public void assertEqual () {
		System.setProperty("webdriver.chrome.driver", "/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		// verify title 
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, "WebDriverUniversity.com");
		// verify url
		boolean exp = driver.getCurrentUrl().contains("apple");
		Assert.assertTrue(exp);
		// verify element displayed
		boolean avl = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
		Assert.assertTrue(avl);
		driver.close();

	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

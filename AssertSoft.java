package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoft {

	WebDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
	}
	@Test
	//SoftAssertion executes all the program even any failed test case in between
	public void assertEqual () {
		System.setProperty("webdriver.chrome.driver", "/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		
		//creating object for softAssert and using it with assert method
		//created variable will help to run all the testcases till the end
		SoftAssert assertVar = new SoftAssert();
		
		// verify title 
		String actualtitle = driver.getTitle();
		assertVar.assertEquals(actualtitle, "WebDriverUniversity.com");
		// verify url
		boolean exp = driver.getCurrentUrl().contains("apple");
		assertVar.assertTrue(exp);
		// verify element displayed
		boolean avl = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
		assertVar.assertTrue(avl);
		driver.close();

	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

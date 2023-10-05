package testng1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1A {

	ChromeDriver driver;

	@BeforeMethod
	public void lunchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");

	}

	@Test(priority = 1)
	public void title() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "WebDriverUniversity.com";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority=2)
	public void url() {
		String actualUrl = driver.getCurrentUrl();
		boolean expectedUrl = actualUrl.contains("WebDriverUniversity");
	}

	@AfterMethod
	public void WinClose() {
		driver.close();
	}

}
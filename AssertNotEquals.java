package testng1;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertNotEquals {

	WebDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
	}
	@Test
	//assertNotEquals method which verify the not equals of element value
	public void assertNotEqual () {
		//prog 1
		String actualTitle = driver.getTitle();
		String  notExpected = "google.com";
		Assert.assertNotEquals(actualTitle, notExpected);
		
		//prog 2 using JavascriptExecutor
		WebElement contactus = driver.findElement(By.cssSelector("#contact-us"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].removeAttribute('target')", contactus);
		contactus.click();
		actualTitle  = driver.getTitle();
		Assert.assertNotEquals(actualTitle,notExpected);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

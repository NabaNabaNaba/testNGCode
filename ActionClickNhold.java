package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionClickNhold {
	ChromeDriver driver;

	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	}

	// click and hold the element by using Action class
	@Test
	public void clickNhold() {
		Actions action2clickHold = new Actions(driver);
		WebElement clickHold = driver.findElement(By.id("click-box"));
		action2clickHold.clickAndHold(clickHold).build().perform();
		//assertion
		String atr = clickHold.getAttribute("style");
		Assert.assertEquals(atr, "background: rgb(0, 255, 0); font-size: 30px;");
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

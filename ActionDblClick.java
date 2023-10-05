package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionDblClick {
	public class test6 {

		WebDriver driver;

		@BeforeMethod
		public void TestCase1() {

			System.setProperty("webdriver.chrome.driver",
					"/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://www.webdriveruniversity.com/Actions/index.html");

		}
		//double click element using Actions class
		@Test
		public void dblClick() {
			Actions action2dblClick = new Actions(driver);
			WebElement dblClick = driver.findElement(By.id("double-click"));
			action2dblClick.doubleClick(dblClick).build().perform();
			// getting the attribute after double click and storing in atr variable
			String atr = dblClick.getAttribute("class");
			// assertion of the action
			Assert.assertEquals(atr, "div-double-click double");
		}

		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}
	}

}

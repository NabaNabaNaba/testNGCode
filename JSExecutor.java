package testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSExecutor {
		
	ChromeDriver driver;
	
		@BeforeMethod
		public void lunchBrowser() {
			System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://www.webdriveruniversity.com/");
		}
		//click element using JavascriptExecutor
		@Test
		public void click() {
			WebElement contactUs = driver.findElement(By.id("contact-us"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click()", contactUs);
			
		}
		//scroll upto the element using JavascriptExecutor
		@Test
		public void scroll() {
			WebElement scrolldatePicker = driver.findElement(By.id("datepicker"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()", scrolldatePicker);
			
		}

		@AfterMethod
		public void closeBrowser() {
		driver.close();
		}
	
	}

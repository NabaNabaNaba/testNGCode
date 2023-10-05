package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionMouseHover {

	ChromeDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	}
	@Test
	public void mouseHover () {
		Actions action2mouseHover = new Actions(driver);
		WebElement msHover = driver.findElement(By.className("dropbtn"));
		action2mouseHover.moveToElement(msHover).build().perform();
			
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}

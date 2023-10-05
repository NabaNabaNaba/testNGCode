package testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionScroll {
	ChromeDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
	}
	//scroll down to the element using action class
	@Test
	public void scrollToElement () {
		Actions action2scroll = new Actions(driver);
		WebElement scroll = driver.findElement(By.className("section-title"));
		action2scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

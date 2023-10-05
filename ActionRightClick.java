package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionRightClick {

	ChromeDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	}
	//right click of the element using Actions class
	@Test
	public void rightClick() {
		Actions action2rightClick = new Actions(driver);
		WebElement rClick = driver.findElement(By.id("double-click"));
		action2rightClick.contextClick(rClick).build().perform();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

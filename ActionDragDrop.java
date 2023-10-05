package testng1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionDragDrop {
	ChromeDriver driver;
	
	@BeforeMethod
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	}
	//drag and drop element using Actions
	@Test
	public void dragNdrop() {
		Actions action2drag = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action2drag.dragAndDrop(drag, drop).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//getting the attribute after dropping the element
		String drp = drop.getAttribute("Class");
		//assertion of the action
		Assert.assertEquals(drp, "ui-widget-header ui-droppable ui-state-highlight");
	}

	@AfterMethod
	public void closeBrowser() {
	driver.quit();
	}

}

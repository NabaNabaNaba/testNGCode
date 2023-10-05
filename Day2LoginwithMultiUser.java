package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2LoginwithMultiUser {
	// setting global driver
	WebDriver driver;

	// creating multidimensional array for multiuser data 
	@DataProvider(name = "loginData")
	public Object[][] loginCredential() {
		return new Object[][] { 
			{ "standard_user", "secret_sauce" },
			{ "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, 
				{ "performance_glitch_user", "secret_sauce" } };
	}
	//should pass dataProvider name which already created in multidimension array
	@Test (dataProvider="loginData")
	public void loginMultiUser(String username, String password) {
		System.setProperty("webdriver.chorme.driver",
				"/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();

		driver.close();
	}

}

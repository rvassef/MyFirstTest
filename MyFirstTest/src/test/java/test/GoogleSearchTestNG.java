package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class GoogleSearchTestNG {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/rvass/workspace/MyFirstTest/drivers/Chromedriver/Chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void googleSearch() {

		/*
		 * Goto google.com
		 */

		driver.get("https://google.com");

		// enter text in search text box

		driver.findElement(By.name("q")).sendKeys("automation step by step");

		// GoogleSearchPage.textbox_search(driver).sendKeys("automation step by
		// step");

		// driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		// GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

		// wait for 4 seconds

	}

	@AfterTest
	public void PostTest() {
		// TODO Auto-generated method stub

		driver.close();
		System.out.println("Test Passed Successfully");

	}

}

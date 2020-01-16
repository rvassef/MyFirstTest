package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		googleSearchTest();

	}

	public static void googleSearchTest() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/rvass/workspace/MyFirstTest/drivers/Chromedriver/Chromedriver.exe");
		driver = new ChromeDriver();

		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

		driver.get("https://google.com");

		searchPageObj.setTextInSearchBox("A B C D");
		// searchPageObj.setTextInSearchBox("A B C D");

		searchPageObj.clickSearchButton();
		
		//driver.getTitle();
		//System.out.println("Success");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();

		System.out.println("Test Completed Successfully");

	}

}

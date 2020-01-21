package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage; 

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearch();
		
		//This is a method outside main
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:/Users/rvass/workspace/MyFirstTest/drivers/Chromedriver/Chromedriver.exe");
	    driver = new ChromeDriver();
		
				
		/*
		 * Goto google.com
		 */
		
		driver.get("https://google.com");
		
		//enter text in search text box
		
		// driver.findElement(By.name("q")).sendKeys("automation step by step");
		
		
		//Using GoogleSearchPage POM
		GoogleSearchPage.textbox_search(driver).sendKeys("automation step by step");
		
		
		
		
		//driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		// wait for 4 seconds
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// close browser
		
		driver.close();
		
		System.out.println("Test Passed Successfully");
		
		
	}

}

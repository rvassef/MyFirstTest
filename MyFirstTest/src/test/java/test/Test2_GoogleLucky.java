package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_GoogleLucky {
	
	public static void main(String[] args) {
		GoogleLucky();
		}
	
	public static void GoogleLucky() {
		

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:/Users/rvass/workspace/MyFirstTest/drivers/Chromedriver/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to google
		
		driver.get("https://google.com");
		driver.findElement(By.id("gbqfbb")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		System.out.println("Test Passed Successfully");
	}
	
	

}
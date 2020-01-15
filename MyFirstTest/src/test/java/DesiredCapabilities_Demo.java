import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("detach", true);
		
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/rvass/workspace/MyFirstTest/drivers/Chromedriver/Chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCDS");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		

	}

}

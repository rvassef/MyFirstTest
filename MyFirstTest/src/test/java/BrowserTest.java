import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/rvass/workspace/MyFirstTest/drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/rvass/workspace/MyFirstTest/drivers/Chromedriver/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:/Users/rvass/workspace/MyFirstTest/drivers/IEDriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		driver.get("http://selenium.dev");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}

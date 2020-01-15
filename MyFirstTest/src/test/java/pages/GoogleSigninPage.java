
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSigninPage {

	public static void main(String[] args) {

		WebDriver driver = null;

		By signin_search = By.id("gb_70");
		By key_search = By.id("identifierId");

	}

	// This is a contructor in order to use driver
	
	private WebDriver driver; 

	public void GoogleSignInPage(WebDriver driver) {
		this.driver = driver;

	}

	public void setTextInSearchBox(String text) {
		By signin_search = null;
		driver.findElement(signin_search).sendKeys(text);

	}

	public void clickSearchButton() {
		By key_search = null;
		driver.findElement(key_search).sendKeys(Keys.RETURN);

	}

}

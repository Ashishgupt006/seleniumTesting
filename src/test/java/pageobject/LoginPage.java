package pageobject;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testpage.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement user;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	public void login(String username, String password) {
		user.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
		String dd = driver.getTitle();
		System.out.println(dd);
		assertEquals(dd, "Swag Labs");

	}

}

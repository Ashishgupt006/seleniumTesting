package testpage;

import org.testng.annotations.Test;

import pageobject.LoginPage;

public class TestLogin extends BasePage {

	@Test
	public void testLogin() {
		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("standard_user", "secret_sauce");
	}
}

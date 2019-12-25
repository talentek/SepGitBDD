package bdd.stepDef;

import static org.testng.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import bdd.rediffmail.PageActions.RediffMailLoginActions;
import bdd.ups.utilities.SetupDrivers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedifMailLoginStepDef {

	RediffMailLoginActions rediffmailAction = new RediffMailLoginActions();

	@Given("^Rediffmail login page launched$")
	public void rediffmail_login_page_launched() {
		rediffmailAction.launchRediffMailLoginPage();
		Assert.assertEquals("Rediffmail", SetupDrivers.driver.getTitle());
		System.out.println(">> RediffMail Login Page Launched Successfully!");
	}

	@When("^User click Go button without userid and password$")
	public void user_click_Go_button_without_userid_and_password() {
		rediffmailAction.submit();

	}

	@Then("^User should be displayed with an error popup$")
	public void user_should_be_displayed_with_an_error_popup() {
		Alert a = SetupDrivers.driver.switchTo().alert();
		String alertText = a.getText();

		if (alertText.toLowerCase().contains("valid")) {
			System.out.println("RediffMail Login error pop up displayed");
		} else {
			System.out.println("FAILED");
			fail();
		}

	}

	@Then("^User should be able to handle error pop message$")
	public void user_should_be_able_to_handle_error_pop_message() {
		Alert a = SetupDrivers.driver.switchTo().alert();
		a.accept();
		Assert.assertEquals("Rediffmail", SetupDrivers.driver.getTitle());
		System.out.println("PASSED");

	}

}

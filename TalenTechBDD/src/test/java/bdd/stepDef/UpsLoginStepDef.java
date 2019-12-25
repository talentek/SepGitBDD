package bdd.stepDef;

import static org.testng.Assert.fail;

import bdd.ups.PageActions.UpsLoginActions;
import bdd.ups.utilities.SetupDrivers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpsLoginStepDef {

	UpsLoginActions loginAction = new UpsLoginActions();

	@Given("^Ups login page is launched$")
	public void ups_login_page_is_launched() {
		loginAction.launchUpsLoginPage();
		if (SetupDrivers.driver.getTitle().toLowerCase().contains("login")) {
			System.out.println(">> Successfully launched UPS login page");
		} else {
			System.out.println("FAILED");
			fail();
		}
	}

	@When("^User input wrong \"([^\"]*)\" and wrong \"([^\"]*)\"$")
	public void user_input_wrong_and_wrong(String userID, String password) {
		loginAction.inputUserID(userID);
		loginAction.inputPassword(password);
		loginAction.submit();

	}

	@Then("^User should receive an error message$")
	public void user_should_receive_an_error_message() {
		String msg = loginAction.errorMsg();
		if (msg.toLowerCase().contains("unsuccessful")) {
			System.out.println(">> PASSED");
		} else {
			System.out.println("FAILED");
			fail();

		}

	}

}

package bdd.stepDef;

import static org.testng.Assert.fail;

import bdd.myntra.PageActions.MyntraMenuPageActions;
import bdd.ups.utilities.SetupDrivers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraMenuStepDef {
	MyntraMenuPageActions menuPageAction = new MyntraMenuPageActions();

	@Given("^Myntra USA site is launched$")
	public void myntra_USA_site_is_launched() {
		menuPageAction.launchMyntraUSASite();
		if (SetupDrivers.driver.getTitle().toLowerCase().contains("usa")) {
			System.out.println(">> Successfully launched in Myntra USA site");
		} else {
			System.out.println(">> Failed to launch in Myntra USA site");
			fail();
		}

	}

	@When("^Customer explores the MEN menu option$")
	public void customer_explores_the_MEN_menu_option() throws InterruptedException{
		menuPageAction.navigateToMenMenu();

	}

	@Then("^Customer should be able to access Watches$")
	public void customer_should_be_able_to_access_Watches() {
		menuPageAction.navigateToMenWatches();
		if (SetupDrivers.driver.getTitle().toLowerCase().contains("watches")) {
			System.out.println(">> Successfully navigated to the Men Watches page");
		} else {
			System.out.println(">> Failed to navigate to the Men Watches page");
			fail();
		}

	}
}

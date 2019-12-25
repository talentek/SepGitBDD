package bdd.myntra.PageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import bdd.myntra.PageElements.MyntraMenuPageLocators;
import bdd.ups.utilities.SetupDrivers;

public class MyntraMenuPageActions {

	MyntraMenuPageLocators menuPageLocator;

	public MyntraMenuPageActions() {
		menuPageLocator = new MyntraMenuPageLocators();
		PageFactory.initElements(SetupDrivers.driver, menuPageLocator);
	}

	public void launchMyntraUSASite() {
		SetupDrivers.driver.get("https://www.myntra.com/usa");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void navigateToMenMenu() throws InterruptedException {
		System.out.println(">> Navigating to the MEN menu");
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(menuPageLocator.menMenu);
		//action.build();
		action.perform();
		Thread.sleep(7000);
	}

	public void navigateToMenWatches() {
		System.out.println(">> Navigating to the Men Watches");
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(menuPageLocator.menWatches);
		action.click();
		action.perform();
	}

}

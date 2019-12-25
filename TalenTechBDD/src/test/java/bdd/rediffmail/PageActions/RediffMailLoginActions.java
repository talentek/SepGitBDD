package bdd.rediffmail.PageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;

import bdd.rediffmailPageElements.RediffMailLoginElements;
import bdd.ups.utilities.SetupDrivers;

public class RediffMailLoginActions {

	RediffMailLoginElements rediffmailElements;

	public RediffMailLoginActions() {
		rediffmailElements = new RediffMailLoginElements();
		PageFactory.initElements(SetupDrivers.driver, rediffmailElements);

	}

	public void launchRediffMailLoginPage() {
		SetupDrivers.driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void submit() {
		rediffmailElements.goButton.click();
	}

}

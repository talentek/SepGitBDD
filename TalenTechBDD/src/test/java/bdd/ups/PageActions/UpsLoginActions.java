package bdd.ups.PageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;

import bdd.ups.PageElements.UpsLoginElements;
import bdd.ups.utilities.SetupDrivers;

public class UpsLoginActions {

	public UpsLoginElements loginElements;

	public UpsLoginActions() {
		loginElements = new UpsLoginElements();
		PageFactory.initElements(SetupDrivers.driver, loginElements);

	}

	public void launchUpsLoginPage() {
		SetupDrivers.driver.get("https://www.ups.com/lasso/login?");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void inputUserID(String userID) {
		loginElements.userid.sendKeys(userID);
	}

	public void inputPassword(String password) {
		loginElements.password.sendKeys(password);
	}

	public void submit() {
		loginElements.submit.click();
	}

	public String errorMsg() {
		String msg = loginElements.errorMsg.getText();
		return msg;

	}

}

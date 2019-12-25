package bdd.myntra.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraMenuPageLocators {
	
	@FindBy(xpath="//a[@data-group='men']")
	public WebElement menMenu;
	
	@FindBy(linkText="Watches")
	public WebElement menWatches;
	

}

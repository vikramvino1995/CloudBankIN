package org.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.UtilityClass;

public class Homepage extends UtilityClass {

	public Homepage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(@class,'binding ')])[1]")
	private WebElement clientsHeader;

	@FindBy(xpath = "(//a[contains(text(),'Clients')])[1]")
	private WebElement clientsOption;

	public WebElement getClientsHeader() {
		return clientsHeader;
	}

	public WebElement getClientsOption() {
		return clientsOption;
	}

	// Methods

	public void selectClientsMenu() {

		javaScriptClick(getClientsHeader());

		javaScriptClick(getClientsOption());

	}

}

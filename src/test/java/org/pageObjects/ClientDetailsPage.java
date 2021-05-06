package org.pageObjects;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;


public class ClientDetailsPage extends UtilityClass{
	
	public ClientDetailsPage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(xpath="//small[contains(text(),'Client')]")	
private WebElement clientId;

@FindBy(xpath="(//span[@class='ng-scope'])[2]")
private WebElement activateButton;

@FindBy(xpath="(//input[@id='activationDate'])[2]")
private WebElement activationDate;

@FindBy(xpath="//button[@id='save']")
private WebElement submit;

@FindBy(xpath="//button[@id='cancel']")
private WebElement cancel;

@FindBy(xpath="(//span[contains(@ng-repeat,'button ')])[2]")
private WebElement createNewLoan;

@FindBy(xpath="//select[@id='productId']")
private WebElement loanProductDropdown;

public WebElement getLoanProductDropdown(){
	return loanProductDropdown;
}

public WebElement getClientId() {
	return clientId;
}

public WebElement getActivateButton() {
	return activateButton;
}

public WebElement getActivationDate() {
	return activationDate;
}

public WebElement getSubmit() {
	return submit;
}

public WebElement getCancel() {
	return cancel;
}

public WebElement getCreateNewLoan() {
	return createNewLoan;
}



//Methods

public void activateClient() throws AWTException {
	
	 leftClick(getActivateButton());
	 
	 enterText(getActivationDate(), "5 May 2021");
	
	 pressEnter();
}


public void createLoan() {
	
	leftClick(getCreateNewLoan());
	
	dropDownBytext(getLoanProductDropdown(),"Testing");
	
}





}

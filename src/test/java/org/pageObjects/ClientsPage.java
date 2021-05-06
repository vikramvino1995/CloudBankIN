package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class ClientsPage extends UtilityClass {

	public ClientsPage(){
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//a[@id='client_createbutton']")
private WebElement createClient;

@FindBy(xpath="//input[@data-ng-model='searchText']")
private WebElement searchClient;

public WebElement getCreateClient() {
	return createClient;
}

public WebElement getSearchClient() {
	return searchClient;
}


//Methods

public void clickCreateClient() {
	
	leftClick(getCreateClient());
		
}

}

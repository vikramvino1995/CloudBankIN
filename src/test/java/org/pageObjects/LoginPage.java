package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class LoginPage extends UtilityClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}


@FindBy(xpath="(//input[@id='uid'])[1]")
private WebElement username;

@FindBy(xpath="//input[@id='pwd']")
private WebElement password;

@FindBy(xpath="(//button[@id='login-button'])[1]")
private WebElement signInBtn;

@FindBy(xpath="//a[contains(text(),'Forgot')]")
private WebElement forgotPswd;

@FindBy(xpath="//b[contains(text(),'SIGN')]")
private WebElement signUp;


public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSignInBtn() {
	return signInBtn;
}

public WebElement getForgotPswd() {
	return forgotPswd;
}

public WebElement getSignUp() {
	return signUp;
}


//Methods

public void signIn(String username,String password) {
	
	getUsername().sendKeys(username);
	
	getPassword().sendKeys(password);
	
	leftClick(getSignInBtn());
	
}









}

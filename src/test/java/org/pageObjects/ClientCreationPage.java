package org.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.UtilityClass;

public class ClientCreationPage extends UtilityClass {

	public ClientCreationPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//div[contains(@class,'container ')])[6]")
	private WebElement legalFormDropdown;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement legalFormTextBox;

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='mobileNo']")
	private WebElement mobile;

	@FindBy(xpath = "//input[@id='dateofbirth']")
	private WebElement dob;

	@FindBy(xpath = "(//div[contains(@class,'container ')])[8]")
	private WebElement clientTypeDropdown;

	@FindBy(xpath = "(//input[@type='text'])[17]")
	private WebElement clientTypeTextbox;

	@FindBy(xpath = "//input[@id='emailAddress']")
	private WebElement email;

	@FindBy(xpath = "(//div[contains(@class,'container ')])[7]")
	private WebElement genderSelectDropdown;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	private WebElement genderSelectTextbox;

	@FindBy(xpath = "(//div[contains(@class,'container ')])[9]")
	private WebElement clientClassificationDropdown;

	@FindBy(xpath = "(//input[@type='text'])[18]")
	private WebElement clientClassificationTextbox;

	@FindBy(xpath = "//a[@ng-click='addAddress()']")
	private WebElement addAddress;

	@FindBy(xpath = "(//a[@class='chosen-single'])[8]")
	private WebElement addressTypeDropdown;

	@FindBy(xpath = "(//input[@type='text'])[22]")
	private WebElement addressTypeTextbox;

	@FindBy(xpath = "//input[@name='street0']")
	private WebElement street;

	@FindBy(xpath = "(//i[@class='fa fa-times'])[2]")
	private WebElement closeAddress;

	@FindBy(xpath = "//button[@id='save']")
	private WebElement submit;

	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	private WebElement cancel;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getClientTypeDropdown() {
		return clientTypeDropdown;
	}

	public WebElement getClientTypeTextbox() {
		return clientTypeTextbox;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getGenderSelectDropdown() {
		return genderSelectDropdown;
	}

	public WebElement getGenderSelectTextbox() {
		return genderSelectTextbox;
	}

	public WebElement getClientClassificationDropdown() {
		return clientClassificationDropdown;
	}

	public WebElement getClientClassificationTextbox() {
		return clientClassificationTextbox;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getAddressTypeDropdown() {
		return addressTypeDropdown;
	}

	public WebElement getAddressTypeTextbox() {
		return addressTypeTextbox;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getCloseAddress() {
		return closeAddress;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getLegalFormDropdown() {
		return legalFormDropdown;
	}

	public WebElement getLegalFormTextBox() {
		return legalFormTextBox;
	}

	public WebElement getLastName() {
		return lastName;
	}

	// Methods

	public void enterClientDetails(String firstName, String lastName, String mobileNo, String dateOfBirth,
			String street, String email) {

		WebDriverWait wait = new WebDriverWait(driver, 40);

		leftClick(getLegalFormDropdown());

		enterText(getLegalFormTextBox(), "person");

		try {
			pressEnter();
		} catch (AWTException e) {

			e.printStackTrace();
		}

		enterText(getFirstName(), firstName);

		enterText(getLastName(), lastName);

		enterText(getMobile(), mobileNo);

		enterText(getDob(), dateOfBirth);

		leftClick(getClientTypeDropdown());

		enterText(getClientTypeTextbox(), "Subscriber");

		try {
			pressEnter();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		enterText(getEmail(), email);

		leftClick(getGenderSelectDropdown());

		enterText(getGenderSelectTextbox(), "Male");

		try {
			pressEnter();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		leftClick(getClientClassificationDropdown());

		enterText(getClientClassificationTextbox(), "Single");

		try {
			pressEnter();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		explicitlyWait(40, getAddAddress());

		leftClick(getAddAddress());

		leftClick(getAddressTypeDropdown());

		enterText(getAddressTypeTextbox(), "Office");

		try {
			pressEnter();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		enterText(getStreet(), street);

		leftClick(getCloseAddress());

		leftClick(getSubmit());

	}

}
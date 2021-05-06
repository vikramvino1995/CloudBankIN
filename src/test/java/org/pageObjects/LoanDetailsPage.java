package org.pageObjects;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class LoanDetailsPage extends UtilityClass {

	public LoanDetailsPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='loanPurposeId_chosen']")
	private WebElement loanPurposeDropdown;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement loanPurposeTextbox;

	@FindBy(xpath = "//div[@id='accountTypeId_chosen']")
	private WebElement accTypeDropdown;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement accTypeTextbox;

	@FindBy(xpath = "//input[@id='submittedOnDate']")
	private WebElement submittedonDate;

	@FindBy(xpath = "//input[@id='expectedDisbursementDate']")
	private WebElement disbursementDate;

	@FindBy(xpath = "//div[@id='repaymentModeId_chosen']")
	private WebElement repaymentModeDropdown;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement repaymentModeTextbox;

	@FindBy(xpath = "(//button[@type='submit'])[12]")
	private WebElement nextPage;

	public WebElement getLoanPurposeDropdown() {
		return loanPurposeDropdown;
	}

	public WebElement getLoanPurposeTextbox() {
		return loanPurposeTextbox;
	}

	public WebElement getAccTypeDropdown() {
		return accTypeDropdown;
	}

	public WebElement getSubmittedonDate() {
		return submittedonDate;
	}

	public WebElement getDisbursementDate() {
		return disbursementDate;
	}

	public WebElement getRepaymentModeDropdown() {
		return repaymentModeDropdown;
	}

	public WebElement getNextPage() {
		return nextPage;
	}

	// Methods

	public void enterLoanDetails() throws AWTException {

		leftClick(getLoanPurposeDropdown());

		enterText(getLoanPurposeTextbox(), "Cattle");

		pressEnter();

		leftClick(getAccTypeDropdown());

		enterText(accTypeTextbox, "Auto Loan");

		pressEnter();

		enterText(getDisbursementDate(), "22 May 2021");

		leftClick(getRepaymentModeDropdown());

		enterText(getLoanPurposeTextbox(), "Cash/Cheque");

		pressEnter();

		leftClick(getNextPage());

	}

}

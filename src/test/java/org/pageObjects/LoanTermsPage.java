package org.pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class LoanTermsPage extends UtilityClass {

	public LoanTermsPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='principal']")
	private WebElement principalAmount;

	@FindBy(xpath = "//input[@name='numofrepayments']")
	private WebElement numOfRepayments;

	@FindBy(xpath = "//input[@id='interestRatePerPeriod']")
	private WebElement nominalInterestRate;

	@FindBy(xpath = "//select[@id='amortizationType']")
	private WebElement amortizationDropdown;

	@FindBy(xpath = "//select[@id='interestCalculationPeriodType']")
	private WebElement interestCalculationPeriod;

	@FindBy(xpath = "//select[@id='transactionProcessingStrategyId']")
	private WebElement repaymentStrategy;

	@FindBy(xpath = "//input[@name='loanterm']")
	private WebElement loanTerm;

	@FindBy(xpath = "//Select[@id='repaymentFrequencyDayOfWeekType']")
	private WebElement repaymentFrequencyDropdown;

	@FindBy(xpath = "(//button[@type='submit'])[13]")
	private WebElement nextPage;

	@FindBy(xpath = "(//button[@type='submit'])[14]")
	private WebElement chargesNextPage;

	@FindBy(xpath = "//button[@id='save']")
	private WebElement reviewSubmit;

	public WebElement getReviewSubmit() {
		return reviewSubmit;
	}

	public WebElement getChargesNextPage() {
		return chargesNextPage;
	}

	public WebElement getPrincipalAmount() {
		return principalAmount;
	}

	public WebElement getNumOfRepayments() {
		return numOfRepayments;
	}

	public WebElement getNominalInterestRate() {
		return nominalInterestRate;
	}

	public WebElement getAmortizationDropdown() {
		return amortizationDropdown;
	}

	public WebElement getInterestCalculationPeriod() {
		return interestCalculationPeriod;
	}

	public WebElement getRepaymentStrategy() {
		return repaymentStrategy;
	}

	public WebElement getLoanTerm() {
		return loanTerm;
	}

	public WebElement getRepaymentFrequencyDropdown() {
		return repaymentFrequencyDropdown;
	}

	public WebElement getNextPage() {
		return nextPage;
	}

	// Methods

	public void enterLoanTermsAndSubmit(String principal, String numOfRepayments, String nominalInterestRate,
			String loanTerm) {

		enterText(getPrincipalAmount(), principal);

		enterText(getNumOfRepayments(), numOfRepayments);

		enterText(getNominalInterestRate(), nominalInterestRate);

		dropDownBytext(getAmortizationDropdown(), "Equal principal payments");

		dropDownBytext(getInterestCalculationPeriod(), "Daily");

		enterText(getLoanTerm(), loanTerm);

		dropDownBytext(getRepaymentFrequencyDropdown(), "TUESDAY");

		leftClick(getNextPage());

		leftClick(getChargesNextPage());

		leftClick(getReviewSubmit());

	}

}

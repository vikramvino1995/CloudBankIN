package org.stepDefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.pageObjects.ClientCreationPage;
import org.pageObjects.ClientDetailsPage;
import org.pageObjects.ClientsPage;
import org.pageObjects.Homepage;
import org.pageObjects.LoanDetailsPage;
import org.pageObjects.LoanTermsPage;
import org.pageObjects.LoginPage;
import org.utility.UtilityClass;

import cucumber.api.java.en.*;

public class ClientCreation extends UtilityClass {

	@Given("User should able to reach the CloudBankIn Application")
	public void user_should_able_to_reach_the_CloudBankIn_Application() {

		launchBrowser();

		loadUrl("https://salesdemo.habiletechnologies.com/");

		maximize();

		driver.manage().deleteAllCookies();

		implicitWait(40);

		Assert.assertTrue(getUrl().contains("habiletechnologies"));

	}

	@When("User should able to click signin by providing {string} and {string}")
	public void user_should_able_to_click_signin_by_providing_and(String username, String password) {

		LoginPage log = new LoginPage();

		log.signIn(username, password);

	}

	@When("User should able to reach Homepage and select Clients Menu")
	public void user_should_able_to_reach_Homepage_and_select_Clients_Menu() {

		Homepage home = new Homepage();

		home.selectClientsMenu();

	}

	@When("User should able to reach the Clients page and click create Client button")
	public void user_should_able_to_reach_the_Clients_page_and_click_create_Client_button() {

		Assert.assertTrue(getUrl().contains("clients"));

		ClientsPage clientPage = new ClientsPage();

		clientPage.clickCreateClient();

	}

	@When("User should able to reach the Client creation page,fill the required details and  enter {string},{string},{string},{string},{string},{string}")
	public void user_should_able_to_reach_the_Client_creation_page_fill_the_required_details_and_enter(String firstName,
			String lastName, String mobileNo, String dateOfBirth, String street, String email) {

		Assert.assertTrue(getUrl().contains("createclient"));

		ClientCreationPage create = new ClientCreationPage();

		create.enterClientDetails(firstName, lastName, mobileNo, dateOfBirth, street, email);

	}

	@When("User should able to select the activate button and enter activation date, then click submit")
	public void user_should_able_to_select_the_activate_button_and_enter_activation_date_then_click_submit()
			throws AWTException {

		ClientDetailsPage details = new ClientDetailsPage();

		details.activateClient();

	}

	@When("User should able to create a new loan and select the loan product for the client")
	public void user_should_able_to_create_a_new_loan_and_select_the_loan_product_for_the_client() {

		ClientDetailsPage details = new ClientDetailsPage();

		details.createLoan();

	}

	@When("User should able to enter the new loan application details")
	public void user_should_able_to_enter_the_new_loan_application_details() throws AWTException {

		LoanDetailsPage loandetails = new LoanDetailsPage();

		loandetails.enterLoanDetails();

	}

	@When("User should able to enter the loan terms {string},{string},{string},{string}")
	public void user_should_able_to_enter_the_loan_terms(String principal, String numOfRepayments,
			String nominalInterestRate, String loanTerm) {

		LoanTermsPage terms = new LoanTermsPage();

		terms.enterLoanTermsAndSubmit(principal, numOfRepayments, nominalInterestRate, loanTerm);

		
	}

}

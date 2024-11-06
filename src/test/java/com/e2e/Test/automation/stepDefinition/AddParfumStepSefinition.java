package com.e2e.Test.automation.stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.e2e.Test.automation.pageObjects.AddParfumPage;
import com.e2e.Test.automation.utils.SeleniumUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddParfumStepSefinition {

	private AddParfumPage addParfumPage;
	private SeleniumUtils seleniumUtils;

	public AddParfumStepSefinition() {

		addParfumPage = new AddParfumPage();
		seleniumUtils = new SeleniumUtils();

	}

	@Given("I am on the welcome page")
	public void i_am_on_the_welcome_page() {

	}

	@When("I whrite gucci guilty in the research box")
	public void i_whrite_gucci_guilty_in_the_research_box() throws InterruptedException {
		seleniumUtils.writeText(AddParfumPage.searchBox(), "gucci guilty");

	}

	@When("I click enter with the keyboard")
	public void i_click_enter_with_the_keyboard() {
		seleniumUtils.waitForElementToBeClickable(AddParfumPage.searchBox());
		AddParfumPage.searchBox().sendKeys(Keys.ENTER);

	}

	@When("I click add to the basket")
	public void i_click_add_to_the_basket() {
		seleniumUtils.waitForElementToBeClickable(AddParfumPage.parfumSelet());
	    AddParfumPage.parfumSelet().click();

	}

	@When("I click go to the basket")
	public void i_click_go_to_the_basket() {
		

	}

	
	
	
	
	@Then("I will be redirected to the payment page")
	public void i_will_be_redirected_to_the_payment_page() {
		

	}
}

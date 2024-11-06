package com.e2e.Test.automation.stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.ObjectInputFilter.Config;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import com.e2e.Test.automation.pageObjects.AuthentificationPage;
import com.e2e.Test.automation.utils.ConfigFileReader;
import com.e2e.Test.automation.utils.SeleniumUtils;
import com.e2e.Test.automation.utils.Setup;
import com.e2e.Test.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {
	
private AuthentificationPage authentificationPage;
private SeleniumUtils seleniumUtils;
private ConfigFileReader configFileReader;
private Validations validations;

	public AuthentificationStepDefinition() {
		authentificationPage = new AuthentificationPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	
	/*/TC-01/*/
	
	@Given("I connect to the application")
	public void iConnectToTheApplication() {
		seleniumUtils.get(configFileReader.getProperties("home.prod"));
	}

	@When("I accept alert")
	public void i_accept_alert() {
		seleniumUtils.click(AuthentificationPage.Alert());;

	}
	    
	    
	@When("I click {string}")
	public void iClick(String string) {
		
		seleniumUtils.click(AuthentificationPage.clickCompte());;
	}

	@When("I add my email {string}")
	public void iAddMyEmail(String email) {
		seleniumUtils.writeText(AuthentificationPage.getEmail(), email);

	}
	
	@When("I add the passeword {string}")
	public void iAddThePasseword(String passeword) {
		seleniumUtils.writeText(AuthentificationPage.getPasseword(), passeword);

	}
	
	@When("I click bouton me connecter")
	public void i_click_bouton_me_connecter() {
		seleniumUtils.click(AuthentificationPage.ClickMeConnecter());
	}
	
		
	@Then("I will be redirected to the home page")
	public void iWillBeRedirectedToTheHomePage() {
	    // Check that the home page image is displayed by verifying its size
	    Dimension dimension = AuthentificationPage.homeImage().getSize();
	    if (dimension.getHeight() > 0 && dimension.getWidth() > 0) {
	        System.out.println("Redirection to home page successful - home image is displayed.");
	    } else {
	    	 System.out.println("Home image is not displayed - redirection failed.");
	    }System.out.println("Home image is not displayed - redirection failed");
	}

	/*/TC-02/*/
	
	
	}


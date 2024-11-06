package com.e2e.Test.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.Test.automation.utils.BasePage;
import com.e2e.Test.automation.utils.Setup;

public class AuthentificationPage extends BasePage {

	
	
	@FindBy(how = How.ID, using = "onetrust-accept-btn-handler")
	private static WebElement acceptAlert;	
	
	@FindBy(how = How.XPATH, using = "//div[@class='header-link header-link--dialog-toggle']")
	private static WebElement compte;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Adresse email']")
	private static WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Mot de passe']")
	private static WebElement passeword;

	@FindBy(how = How.XPATH, using = "//e2core-login-form[@class='account-login__form-item']//button[@type='submit'][normalize-space()='ME CONNECTER']")
	private static WebElement btnMeConnecter;
	
	@FindBy(how = How.XPATH, using = "//div[@class='header-logo__wrapper header-logo--always-visible']//img[@title='MARIONNAUD 40ANS']")
	private static WebElement image;
	
	@FindBy(how = How.XPATH, using = "//div[@class='header-link header-link--dialog-toggle']")
	private static WebElement btnBonjour;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Se déconnecter']")
	private static WebElement btnDeconnexion;
	
	
	

	public static WebElement clickCompte() {
		return compte;
	}

	
	public static WebElement Alert() {
		return acceptAlert;
	}
	
	public static WebElement getEmail() {
		return email;

	}

	public static WebElement getPasseword() {
		return passeword;
	}

	public static WebElement ClickMeConnecter() {
		return compte;
	}

	public static WebElement ConnectBtn() {
		return btnMeConnecter;
	}

	public static WebElement homeImage() {
		return image;
		
	}	
	
	public static WebElement btnWelcome() {
		return btnBonjour;
		
	}
	public static WebElement deconnexion() {
		return btnDeconnexion;
		
	}
	
		
	

	public AuthentificationPage() {
		super(Setup.getDriver());
	}

}

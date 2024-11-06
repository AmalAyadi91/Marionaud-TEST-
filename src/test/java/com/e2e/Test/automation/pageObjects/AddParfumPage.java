package com.e2e.Test.automation.pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2e.Test.automation.utils.BasePage;
import com.e2e.Test.automation.utils.Setup;

public class AddParfumPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Rechercher un produit ...']")
	private static WebElement research;

	@FindBy(how = How.CSS, using = "body > app-root > cx-storefront > main > cx-page-layout > cx-page-slot.SearchResultsGridSlot.has-components > e2-search-results-grid > e2-product-list > div > div.product-grid__products-list > e2-flex > e2-product-tile > div > div > div.product-list-item__image-container > a")
	private static WebElement addParfum;

	@FindBy(how = How.CSS, using = "body > app-root > ngb-modal-window > div > div > e2-added-to-cart-dialog > div > div.add-to-cart-dialog__body.modal-body > div.add-to-cart-dialog__actions > cx-generic-link > a")
	private static WebElement goToBasket;
	


	public AddParfumPage() {
		super(Setup.getDriver());
	}

	public static WebElement searchBox() {
		return research;
	}

	public static WebElement parfumSelet() {
		return addParfum;
	}

	public static WebElement basket() {
		return goToBasket;
	}
	
	
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage extends basePage {

	public cartPage(WebDriver driver) {
		super(driver);
	}
	
	
	private By addQuantity = By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div/div/div[1]/div[3]/div[2]/div/div/span[2]");
    private By removeProduct = By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[3]/div[2]/div/span");
    private By agreeButton = By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div/div/div[2]/button[1]");
    private By CheckoutButton = By.linkText("Checkout");

	 public void add_quantity() {
		 wait_elment_to_be_visible(base_page_driver , 25 , addQuantity);
			wait_for_element_to_be_clickable( base_page_driver, addQuantity, 25);
		   
			base_page_driver.findElement(addQuantity).click();
	 }
	 
	 public void remove_product() {
		 wait_elment_to_be_visible(base_page_driver , 25 , removeProduct);
			wait_for_element_to_be_clickable( base_page_driver, removeProduct, 25);
		   
			base_page_driver.findElement(removeProduct).click();
	 }
	 
	 public void confirm_remove_product() {
		 wait_elment_to_be_visible(base_page_driver , 25 , agreeButton);
			wait_for_element_to_be_clickable( base_page_driver, agreeButton, 25);
		   
			base_page_driver.findElement(agreeButton).click();
	 }
	 
	 public void click_on_checkout() {
		 wait_elment_to_be_visible(base_page_driver , 25 , CheckoutButton);
			wait_for_element_to_be_clickable( base_page_driver, CheckoutButton, 25);
		   
			base_page_driver.findElement(CheckoutButton).click();
	 }
}

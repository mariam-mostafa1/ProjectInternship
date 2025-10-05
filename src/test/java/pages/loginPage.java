package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends basePage {

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	private By phoneNumber = By.name("identifier");
	private By password = By.name("password");
	private By submitButton = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div/div/form/div[2]/button");
	
	public void insert_phone_number(String pnoneNum) {
		wait_elment_to_be_visible(base_page_driver , 25 , phoneNumber);
		base_page_driver.findElement(phoneNumber).clear();
		base_page_driver.findElement(phoneNumber).sendKeys(pnoneNum);
		}
	
	public void insert_password(String passwordNum) {
		wait_elment_to_be_visible(base_page_driver , 25 , password);
		base_page_driver.findElement(password).clear();
		base_page_driver.findElement(password).sendKeys(passwordNum);
		}
	public void click_on_submit_button() {
		wait_elment_to_be_visible(base_page_driver , 25 , submitButton);
		base_page_driver.findElement(submitButton).click();
		
	}


}

package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class checkoutPage extends basePage {

	public checkoutPage(WebDriver driver) {
		super(driver);
	}

	
	private By state = By.xpath("//*[@id=\"steps-container\"]/div/div/div[2]/div/form/div[2]/div[4]/div[2]/select");
	private By city = By.xpath("//*[@id=\"steps-container\"]/div/div/div[2]/div/form/div[2]/div[4]/div[3]/select");
	private By firstName = By.name("billing.first_name");
	private By lastName = By.name("billing.last_name");
	private By email = By.name("billing.email");
	private By address = By.name("billing.address.[0]");

	
	

public void choose_state(String stateName) throws InterruptedException {
	
	wait_elment_to_be_visible(base_page_driver , 25 , state);

    WebElement stateDropdown = base_page_driver.findElement(state);
    Select select = new Select(stateDropdown);

    select.selectByVisibleText(stateName);
    Thread.sleep(2000); 
}


public void choose_city(String cityName) throws InterruptedException {
	wait_elment_to_be_visible(base_page_driver , 25 , city);

    WebElement stateDropdown = base_page_driver.findElement(city);
    Select select = new Select(stateDropdown);

    select.selectByVisibleText(cityName);
    Thread.sleep(2000); 
} 

public void insert_firstName_forCheckout(String setFirstName) throws InterruptedException {
	wait_elment_to_be_visible(base_page_driver , 25 , firstName);
	base_page_driver.findElement(firstName).clear();
	base_page_driver.findElement(firstName).sendKeys(setFirstName);
	Thread.sleep(2000); 
	}

public void insert_lastName_forCheckout(String setLastName) throws InterruptedException {
	wait_elment_to_be_visible(base_page_driver , 25 , lastName);
	base_page_driver.findElement(lastName).clear();
	base_page_driver.findElement(lastName).sendKeys(setLastName);
	Thread.sleep(2000); 
	}

public void insert_emailAddress_forCheckout(String setEmailAddress) {
	wait_elment_to_be_visible(base_page_driver , 25 , email);
	base_page_driver.findElement(email).clear();
	base_page_driver.findElement(email).sendKeys(setEmailAddress);
	}

public void insert_address_forCheckout(String setAddress) throws InterruptedException {
	wait_elment_to_be_visible(base_page_driver , 25 , address);
	base_page_driver.findElement(address).clear();
	base_page_driver.findElement(address).sendKeys(setAddress);
	Thread.sleep(2000); 
}

}

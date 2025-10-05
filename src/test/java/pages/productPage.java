package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage extends basePage {

	public productPage(WebDriver driver) {
		super(driver);
	}
	
	private By search_input = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[2]/form/div/input");
    private By laptop = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/a");
    private By add_toCart_but = By.xpath("//*[@id=\"main\"]/div[2]/form/div/div/div[2]/div[6]/button");//	private By smartwatch = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[2]/div[2]/div/div[3]/a");
	private By smartwatch = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/a");
    private By viewCartButton = By.linkText("View Cart");
    
    
	public void search_product(String searchData) {
		wait_elment_to_be_visible(base_page_driver , 25 , search_input);
			wait_for_element_to_be_clickable(base_page_driver , search_input , 25);

			 WebElement searchBox = base_page_driver.findElement(search_input);
			    searchBox.clear();
			    searchBox.sendKeys(searchData + Keys.ENTER);
			
			}
	 
	 public void click_on_laptop() {
		 wait_elment_to_be_visible(base_page_driver , 25 , laptop);
			base_page_driver.findElement(laptop).click();
			
		}
	 
	 public void addToCartButton() throws InterruptedException {
		 wait_elment_to_be_visible(base_page_driver , 25 , add_toCart_but);
			wait_for_element_to_be_clickable( base_page_driver, add_toCart_but, 25);
			Thread.sleep(2000); 
			base_page_driver.findElement(add_toCart_but).click();
			
		}
	 
	 public void click_on_smartwatch() {
		 wait_elment_to_be_visible(base_page_driver , 25 , smartwatch);
			base_page_driver.findElement(smartwatch).click();
			
		}
	 

	 public void view_cart() {
		 wait_elment_to_be_visible(base_page_driver , 25 , viewCartButton);
			wait_for_element_to_be_clickable( base_page_driver, viewCartButton, 25);
		   
			base_page_driver.findElement(viewCartButton).click();
			
		}

}

package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	public Search (Common_Steps cp) {
		driver=cp.getDriver();
	}
	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
	    driver.get("https://www.ebay.com/");
	}

	@When("I Search {string} in {string} Category")
	public void i_search_in_category(String string, String string2) {
	    driver.findElement(By.xpath(" //input[@id='gh-ac']")).sendKeys(string);
	    driver.findElement(By.xpath(" //select[@id='gh-cat']")).click();
	    List<WebElement> cat =driver.findElements(By.xpath(" //select[@id='gh-cat']/option"));
	    for(WebElement x:cat) {
	    	if(x.getText().trim().toLowerCase().equals(string2.trim().toLowerCase())) {
	    		x.click();
	    		break;
	    	}
	    }
	    driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}
	
}
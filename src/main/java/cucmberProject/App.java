package cucmberProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"\\resource\\chromedriver.exe"));
	driver= new ChromeDriver();
	driver.get("https://www.ebay.com/");

	
	
	
	
	
	//	System.out.println(System.getProperty("user.dir"));
}
}

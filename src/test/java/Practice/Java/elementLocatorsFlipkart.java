package Practice.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementLocatorsFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/akshit2707/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	 System.out.println(driver.findElement(By.className("xtXmba")));
		//
	 
	 
	
	 driver.quit();
	}	
		

}

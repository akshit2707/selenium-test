package Practice.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito","--disable-notifications");

		// The driver location should be in path variable ins application yml
		System.setProperty("webdriver.chrome.driver","/Users/akshit2707/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://www.facebook.com/");
		WebElement below=driver.findElement(By.xpath("//div[@class='_6lux']"));
		By emailLocator = RelativeLocator.with(By.tagName("input")).near(below);
	     
		WebElement email=driver.findElement(emailLocator);

		//email should be from env variable
		email.sendKeys("HIDDEN");

		
		By passwordLocator=RelativeLocator.with(By.tagName("input")).above(By.xpath("//div[@class='_6ltg']"));
		
	   WebElement pass=driver.findElement(passwordLocator);

	   //password should also be from application properties :: Security reason
	   pass.sendKeys("HIDDEN");
	    
	    driver.findElement(By.cssSelector("button[name='login']")).click();
	    Thread.sleep(10000);
	    
	    By profileLocator=RelativeLocator.with(By.tagName("div")).toRightOf(By.cssSelector("a[aria-label*='Notifications']"));
	    
	    driver.findElement(profileLocator).click();
	    Thread.sleep(10000);
	    //driver.findElement(By.linkText("Privacy")).click();
	    
	   driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	   
	   driver.quit();
	   
	}

}

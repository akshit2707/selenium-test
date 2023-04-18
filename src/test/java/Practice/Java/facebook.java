package Practice.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito","--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://www.facebook.com/");
		WebElement below=driver.findElement(By.xpath("//div[@class='_6lux']"));
		By emailLocator = RelativeLocator.with(By.tagName("input")).near(below);
	     
		WebElement email=driver.findElement(emailLocator);
		
		email.sendKeys("radhika.sharma5756@gmail.com");
		
		By passwordLocator=RelativeLocator.with(By.tagName("input")).above(By.xpath("//div[@class='_6ltg']"));
		
	   WebElement pass=driver.findElement(passwordLocator);
	   pass.sendKeys("Ranchi@123");
	    
	    driver.findElement(By.cssSelector("button[name='login']")).click();
	    Thread.sleep(10000);
	    
	    By profileLocator=RelativeLocator.with(By.tagName("div")).toRightOf(By.cssSelector("a[aria-label*='Notifications']"));
	    
	    driver.findElement(profileLocator).click();
	    Thread.sleep(10000);1
	    //driver.findElement(By.linkText("Privacy")).click();
	    
	   driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	   
	   driver.quit();
	   
	}

}

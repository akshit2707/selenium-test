package Practice.Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/akshit2707/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//id
		WebElement trial=driver.findElement(By.id("name"));
		System.out.println(trial);
		System.out.println(trial.getAttribute("tagName"));
		//name
		System.out.println(driver.findElement(By.name("dropdown-class-example")));
		// linktext // partial linktext
		System.out.println(driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")));
		System.out.println(driver.findElement(By.partialLinkText("ResumeAssistance/Material")));
		//tagname
		List<WebElement> webele =driver.findElements(By.tagName("input"));
		System.out.println(webele.size());
		for( WebElement ele : webele)
		{
			System.out.println(ele);
		}
	}	

}

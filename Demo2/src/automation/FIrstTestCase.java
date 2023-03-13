package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIrstTestCase {
	
	WebDriver driver;
	
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/StudyData/SDMDAC/se/chromedriver_mac64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	
	public void searchProduct() 
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bose");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Today's Deals")).click();
		
	} 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FIrstTestCase ft = new FIrstTestCase();
		ft.launchBrowser();
		ft.searchProduct();
	}

}

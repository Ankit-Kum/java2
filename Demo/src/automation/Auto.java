package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	
	WebDriver driver;
	
	public void Lanuch() 
	
	{
	
	System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/StudyData/SDMDAC/se/chromedriver_mac64/chromedriver");
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.in");
	}
	public void searchProduct() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto ob = new Auto();

        ob.Lanuch();
        ob.searchProduct();
	}

}

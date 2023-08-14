package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationbookstore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		Thread.sleep(3000);
		WebElement closeBtn = driver.findElement(By.cssSelector("a[title='Clear text']"));
		if(closeBtn.isDisplayed())
		{
			closeBtn.click();
		}
		
		

	}

}

package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleserach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Selenium tutorials");
		searchBox.sendKeys(Keys.ENTER);
		String ResultURL = driver.getCurrentUrl();
		System.out.println("Current URL");
		String curtTitle= driver.getTitle();
		System.out.println("Current Title :"+curtTitle);
		driver.navigate().back();
		String backwordTitle= driver.getTitle();
		System.out.println("Backword page Title :"+backwordTitle);
		searchBox.sendKeys("java tutorials");
		Thread.sleep(5000);
		List <WebElement> items = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']/span"));
		for(WebElement x : items)
		{
			if(x.getText().equalsIgnoreCase("java tutorials"));
				x.click();
				break;
		}
		driver.quit();



	}		

}

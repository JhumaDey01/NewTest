package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement menu = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li//a[contains(text(),'Components')]"));
		WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(),'Printers (0)')]"));
		action.moveToElement(menu).click(menuItem).build().perform();
		driver.quit();
		

	}

}

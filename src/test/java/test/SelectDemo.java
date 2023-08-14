package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select selMulti =new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
		selMulti.selectByValue("Washington");
		selMulti.selectByIndex(2);
		selMulti.selectByVisibleText("Texas");
		List<WebElement> items = driver.findElements(By.xpath("//select[@id='multi-select']/option"));
		for(WebElement x : items)
		{
			if(x.isSelected())
			{
				System.out.println("Text is "+x.getText() );
			}
		}
		
		
		
	}

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement checkBox = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
		if(!checkBox.isSelected())
		{
			checkBox.click();
		}
		driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("(//input[@value='Female'])[1]")).click();
	}
	


}

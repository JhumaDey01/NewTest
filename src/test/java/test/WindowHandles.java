package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parent = driver.getWindowHandle();
		WebElement winButton = driver.findElement(By.xpath("//button[contains(text(),' Click to open new Tab ')]"));
		winButton.click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Size is : "+ windows.size());
		for(String tab : windows)
		{
			if(!tab.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(tab);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("(//span[contains(text(),'Home')])[1]")).click();
				
			}
			driver.close();
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//button[contains(text(),'Click to open new Window')]"));
			//driver.close();
			//driver.quit();
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://demo.opencart.com/");
			driver.quit();
		}
	}

}

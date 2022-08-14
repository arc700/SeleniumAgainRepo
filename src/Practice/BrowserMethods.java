package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://automationbykrishna.com/");
		//WebDriver driver1 = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.findElement(By.xpath("//*[Text()='Amazon Pay']")).click();
		
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("after back");
		//driver.close();
		//driver1.close();
	}

}

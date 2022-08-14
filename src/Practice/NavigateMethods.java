package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateMethods {
	
	@Test
	public  void m1() {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("http://automationbykrishna.com/");
		//WebDriver driver1 = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("//*[text()='Sell']")).click();
		
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("after navigation back");
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();		
		System.out.println("after navigation back");
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.navigate().to("http://automationbykrishna.com/");
		System.out.println(driver.getTitle());
		
		//driver.quit();
		driver.close();
		//driver1.close();
	}

}

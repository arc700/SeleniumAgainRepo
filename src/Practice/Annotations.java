package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	/*@BeforeMethod 
	public void openBrowser() {
		System.out.println("Before method Open");	
		}
	@AfterMethod 
	public void closeBrowser() {
		System.out.println("AftreMethod close");	
		}*/
	@BeforeClass 
	public void openBrowser() {
		System.out.println("Before method Open");	
		}
	@AfterClass 
	public void closeBrowser() {
		System.out.println("AftreMethod close");	
		}
	@Test
	public void firstTest() {
	System.out.println("3st");	
	}
	@Test
	public void secondTest() {
		System.out.println("3rd");	
	}
	@Test 
	public void exampleTest() {
		System.out.println("techno 3nd.........B2");	
	}
}

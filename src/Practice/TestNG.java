package Practice;

import org.testng.annotations.Test;

public class TestNG {
	@Test(groups = "smoke")
	public void firstTest() {
	System.out.println("1st");	
	}
	@Test(groups = "regression")
	public void secondTest() {
		System.out.println("1st 2nd");	
	}
	@Test (groups = "smoke")
	public void exampleTest() {
		System.out.println("techno");	
	}
}

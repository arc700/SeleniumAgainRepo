package Practice;

import org.testng.annotations.Test;

public class TestNG2 {
	@Test(groups = "smoke")
	public void firstTest() {
	System.out.println("2st");	
	}
	@Test(groups = "regression")
	public void secondTest() {
		System.out.println("2nd");	
	}
	@Test (groups = "smoke")
	public void exampleTest() {
		System.out.println("techno 2nd");	
	}
}

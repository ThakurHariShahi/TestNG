package Qainfotech.TestNg.PageFactory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PageFactory1 {
	int param;

	public PageFactory1(int param) {
		System.out.println("you r in PageFactory1");
		this.param = param;
	}
	
	
/******************  CALL THESE METHOD FROM PAGEFACTORY   ***************/
	
	@Test
	public void Test1() {
	    int opValue = param;
	    System.out.println("Test method one output: " + opValue);
	}

	@Test
	public void Test2() {
	    int opValue = param + 5;
	    System.out.println("Test method two output: " + opValue);
	}
}

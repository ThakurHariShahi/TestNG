package Qainfotech.TestNg.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderEx {

	@DataProvider(name = "Authentication")
	public static Object[][] A() {
		System.out.println("you r in A");
		return new Object[][] { { "testuser_1", "Test@123" }, 
								{ "testuser_2", "Test@123" },
								{ "testuser_3", "Test@123" }, 
								{ "testuser_4", "Test@123" }, 
								{ "testuser_5", "Test@123" },
								{ "testuser_6", "Test@123" }, 
								{ "testuser_7", "Test@123" } 
								
							  };
	}
}

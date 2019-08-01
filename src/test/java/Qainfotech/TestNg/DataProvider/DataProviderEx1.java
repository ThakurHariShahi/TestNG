package Qainfotech.TestNg.DataProvider;

import org.testng.annotations.Test;

public class DataProviderEx1 {
	
	
	@Test(dataProvider = "Authentication", dataProviderClass = DataProviderEx.class)
    public void testMethod(String u,String p){
		System.out.println("you r in testMethods");
        
		System.out.println("Username is: " + u);
        System.out.println("Password is: " + p+"\n");
    }
}











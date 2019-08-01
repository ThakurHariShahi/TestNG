package Qainfotech.TestNg.PageFactory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PageFactory {
	@Factory
    public static Object[] factoryMethod() {
		
		System.out.println("you r in PageFactory");
        return  new Object[] {
        		       new PageFactory1(0), 
        		       new PageFactory1(1),
        		       new PageFactory1(2) 
        		       };
    }
	
}

package Qainfotech.TestNg.DependsOnMethod;

import org.testng.annotations.Test;

public class DependsOMethod_Ex {

	@Test
	public void h()
    {System.out.println("h");}
	@Test
	public void a() 
	{System.out.println("a");}
	@Test
	public void i() 
	{System.out.println("i");}
	@Test
	public void b() 
	{System.out.println("b");}
	
	@Test(dependsOnMethods = "e")
	public void c() 
	{System.out.println("c");}
	
	@Test
	public void d() 
	{System.out.println("d");}
	@Test
	public void f() 
	{System.out.println("f");}
	@Test
	public void e() 
	{System.out.println("e");}
	
	@Test
	public void g() 
	{System.out.println("g");}
	
	@Test(dependsOnMethods= "b")   //i
  	public void j() 
	{System.out.println("j");}
}

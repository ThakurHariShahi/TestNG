package Qainfotech.TestNg.Priority;

import org.testng.annotations.Test;

public class Priority_Ex {

	@Test(priority = 3)
	public void h() {
		System.out.println("h");
	}

	@Test(priority = 1)
	public void a() {
		System.out.println("a");
	}

	@Test(priority = -4)
	public void i() {
		System.out.println("i");
	}

	@Test(priority = 0)
	public void b() {
		System.out.println("b");
	}

	@Test(priority = +2)
	public void c() {
		System.out.println("c");
	}

	@Test(priority = -2)
	public void d() {
		System.out.println("d");
	}

	@Test(priority = 8)
	public void f() {
		System.out.println("f");
	}

	@Test(priority = -9)
	public void e() {
		System.out.println("e");
	}

	@Test(priority = -9)
	public void g() {
		System.out.println("g");
	}

	@Test(priority = 0)
	public void j() {
		System.out.println("j");
	}

}

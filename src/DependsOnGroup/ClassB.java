package DependsOnGroup;

import org.testng.annotations.Test;

public class ClassB {
	@Test(groups= {"Regression"})
	public void m1() {
		System.out.println("m1 of B");
	}
	@Test
	public void m2() {
		System.out.println("m2 of B");
	}
	@Test
	public void m3() {
		System.out.println("m3 of B");
	}
	@Test
	public void m4() {
		System.out.println("m4 of B");
	}
	@Test(groups= {"Regression","Chintu"})
	public void m5() {
		System.out.println("m5 of B");
	}
	@Test(groups="Bhavesh")
	public void m6() {
		System.out.println("m6 of B");

	}
		
	}
		



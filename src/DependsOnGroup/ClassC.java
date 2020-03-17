package DependsOnGroup;

import org.testng.annotations.Test;

public class ClassC {
	@Test(groups= {"Regression"})
	public void m1() {
		System.out.println("m1 of C");
	}
	@Test
	public void m2() {
		System.out.println("m2 of c");
	}
	@Test(priority=-3)
	public void m3() {
		System.out.println("M3 of C");
	}
	@Test
	public void m4() {
		System.out.println("m4 of C");
	}
	@Test
	public void m5() {
		System.out.println("m5 of C");
	}
	@Test
public void m6() {
		System.out.println("m6 of c");
		
	}
		
	}
		
	

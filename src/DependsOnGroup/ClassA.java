package DependsOnGroup;

import org.testng.annotations.Test;

public class ClassA {
	@Test(groups= {"Regression"})
	public void m1() {
		System.out.println("m1 of A");
		//throw new ArithmeticException();
	}
	@Test(dependsOnMethods={"m1"})
	public void m2() {
		System.out.println("m2 of A");
	}
	@Test(groups= {"Regression","Bhavesh"})
	public void m3() {
		System.out.println("m3 of A");
	}
	@Test(groups= {"Bhavesh"})
	public void m4() {
		System.out.println("m4 of A");
	}
	@Test(dependsOnGroups= {"Regression"},groups= {"Bhavesh"})
    public void m5() {
    	System.out.println("m5 of A");
    }
    @Test
   public void m6() {
		System.out.println("m6 of A");

	}
	
}


		

	
		

	

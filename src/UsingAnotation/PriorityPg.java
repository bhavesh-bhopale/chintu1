package UsingAnotation;

import org.testng.annotations.Test;

public class PriorityPg {
//	@Test
//	public void m1() {
//		System.out.println("My first test case");
//	}
//	@Test
//	public void m2() {
//		System.out.println("my second test case");
//	}
//	@Test
//	public void m3() {
//		System.out.println("my third test case");
//		
//
//	}
//	
//		
//
//	}
	    
	    //2nd program)
	//Highst priority (-ve)
	//Highst priority pass then 1st run in highst priority.
	//defaulst priority zero.
	@Test
	public void m1() {
		System.out.println("this is the first test case");
	}

	@Test(priority =-2)
	public void m2() {
		System.out.println("this is the 2nd test case");
	}

	@Test
	public void m3() {
		System.out.println("this is the third test case");
		int i = 0;
		int x = 10 / 0;

	}
}

	
	
	  


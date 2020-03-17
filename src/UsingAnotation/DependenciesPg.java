package UsingAnotation;

import org.testng.annotations.Test;
//soft dependencies alwaysrun=true; OR hard dependencies alwaysrun=false
public class DependenciesPg {
	@Test(dependsOnMethods={"m3"},alwaysRun=true)
	public void m1()throws InterruptedException{
		System.out.println("I am comming in class 1pm ");
	
	}
	@Test
	public void m2() {
		System.out.println("Today will focous work in TestNg");
	}
	@Test
	public void m3() {
		System.out.println("Finally reach in my homework");
		int i=0;
		int x=10/0;
		

	}
		

	}

	
	



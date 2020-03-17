package UsingAnotation;

import org.testng.annotations.Test;
//pass by boolean value true or false
public class EnablePg {
	@Test(enabled=true)
	public void m1() {
		System.out.println("Hello testing Shastra");
	}
	@Test(enabled=false)
	public void m2() {
		System.out.println("I am Satsfied");
	}
	@Test
	public void m3() {
		System.out.println("Test case three");

	}

}

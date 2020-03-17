package UsingAnotation;

import org.testng.annotations.Test;

public class InvocationTimeOut {
	@Test(invocationTimeOut=5000)
	public void m1() throws InterruptedException {
	System.out.println("I am bhavesh");
	Thread.sleep(5000);
	}
	@Test(invocationTimeOut=4000)
	public void m2() throws InterruptedException {
		System.out.println("i am comming from Nerpinglai");
		Thread.sleep(7000);
	}
	@Test
	public void m3() {
		System.out.println("I live at Nigadi pradhikaran pune");

	}

	}

	



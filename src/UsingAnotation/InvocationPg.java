package UsingAnotation;

import java.io.InterruptedIOException;

import org.testng.annotations.Test;
//count will be (+ve)case test case run but depends on count 2 time count then Two time test case run.
 
public class InvocationPg {
		@Test(invocationCount=2)
		public void m1()throws InterruptedException{
			System.out.println("This is firsr invoaction");
		}
		//method with this annotation will not a take part in execution
		//in invocation count is set to zero then aslo the test case will not participate in execution
		@Test(invocationCount=-2)
		public void m2()throws InterruptedException{
			System.out.println("This is second invocation");
		
		}
}
		
		




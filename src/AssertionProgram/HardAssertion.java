package AssertionProgram;


import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void tc_01() {
		int a,b;
		System.out.println("Enter two No");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int c=a+b;
		Assert.assertEquals(c,a+b);
	}
	
}
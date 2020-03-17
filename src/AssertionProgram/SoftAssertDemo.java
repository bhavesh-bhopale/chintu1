package AssertionProgram;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void SoftAssertTestExample() {
		int a=5,b=6,c=7;
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(a, 5);
	    soft.assertEquals(b, 6);
		soft.assertEquals(c, 7);
		soft.assertAll();
	}

}
  
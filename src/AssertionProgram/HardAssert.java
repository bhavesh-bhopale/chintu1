package AssertionProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	String exceptedErrorMessage="Invalid UserName or PassWord";
	
	@Test
	public void tc_01() {
		Assert.assertEquals(true, true, "actual,exceptedErrorMessage");
	}
}

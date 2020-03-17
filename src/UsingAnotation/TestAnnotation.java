package UsingAnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAnnotation {
	@Parameters({"rollNumber","StudentName"})
	@Test
	public void m1(String rollNumber,String sName) {
		System.out.println("m1 test case: "+rollNumber);
		System.out.println("Student s name is: "+sName);
	}

	@BeforeTest
	public void m2() {
		System.out.println("Before test");

	}

	@Test
	public void m3() {
		System.out.println("m2 test case");
	}

	@AfterTest
	public void m4() {
		System.out.println("After test");
	}

	@BeforeSuite
	public void m5() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void m6() {
		System.out.println("After suite");
	}

	@BeforeMethod
	public void m7() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void m8() {
		System.out.println("After method");
	}

	@DataProvider
	public void m9() {
		System.out.println("This is data provider");
	}

	@BeforeClass
	public void m10() {
		System.out.println("Before class");
	}
	@AfterClass
	private void m11() {
		System.out.println("After class");

	}
	
	}


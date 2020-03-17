package DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CustamizeException.DataProviders;
import CustamizeException.InvalidUserOrPassWordException;

public class SignUp {
	@Test(expectedExceptions={ArithmeticException.class,IOException.class})
	public void PositiveTestCase() {
		System.out.println("Hello i am bhavesh");
		throw new ArithmeticException();
	}
	@Test(dataProvider="LoginDataProvider",dataProviderClass=DataProviders.class)
	public void m1(String Uname,String pass)throws InvalidUserOrPassWordException{ 
		if(Uname.contains("user")&& pass.contains("pass")) {
		System.out.println(Uname+"\t"+pass);
		}else {
			throw  new InvalidUserOrPassWordException(); 
		}
	
	}
}



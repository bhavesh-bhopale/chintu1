package CustamizeException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="LoginDataProvider")
	public Object[][]loginData(){
		Object[][] values= {{"user1","pass"},{"user2","pass2"}, {"user3","pass3"},
		                   {"Bhavesh","Chintu"}};
		return values;

}
}
//	@DataProvider(name="SignUpDataProvider")
//	public void SignUpData() {
//		System.out.println("Accept Signup Data in excel Sheet");
//	}
//	@DataProvider(name="CustomerDataProvider")
//	public void customerDataProvider() {
//	}
//}

package CrossBrowserTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public  class CBTDemo {
	static RemoteWebDriver driver;
	@BeforeTest
	@Parameters({"browserName"})
	private static void OpenBrowser(String browserName) {
		switch (browserName) {
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Desktop\\Selenium WebDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "FireFox":
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hi\\Desktop\\Selenium WebDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver","C:\\Users\\hi\\Desktop\\Selenium WebDriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		}
	}
	@Parameters({"browserName"})
	@Test
	public void OpenFacebook(String browserName) {
		OpenBrowser(browserName);
		driver.get("https://www.facebook.com");
		
	}
	@Test
	@Parameters({"browserName"})
	
	public void OpenGoogle(String browserName) {
		OpenBrowser(browserName);
		driver.get("https://www.google.com");
		

	}
			
			
			
		
}
	



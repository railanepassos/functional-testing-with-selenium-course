import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestGoogle {
	
	// By including "@Test" we are informing JUnit that the following method will be a test.
	// The purpose of the test is to validate the title of the page
	@Test
	public void test() {
		 
		//WebDriver driverFirefox = new FirefoxDriver();
		WebDriver driverChrome = new ChromeDriver();
		//WebDriver driverIE = new InternetExplorerDriver();
		//driverFirefox.get("http://www.google.com");
		driverChrome.get("http://www.google.com");
		//driverIE.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		
		// assertEquals - This is method comparative 
		//Assert.assertEquals("Google", driverFirefox.getTitle());
		Assert.assertEquals("Google", driverChrome.getTitle());
		//Assert.assertEquals("Google", driverIE.getTitle());
		
		
		
	
	}

}

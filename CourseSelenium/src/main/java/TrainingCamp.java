import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrainingCamp {
	
	@Test
	// This test should validate the interaction with elements of type Text
	public void interactionWithText() {
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.manage().window().setSize(new Dimension(600, 800));
		driverFirefox.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		// Map Elements
	    //String textName = driverFirefox.findElement(By.id("elementosForm:nome")).getAttribute("value");

		driverFirefox.findElement(By.id("elementosForm:nome")).sendKeys("Writing Test.");
	    //Assert.assertEquals("Writing Tests.", textName);
		Assert.assertEquals("Writing Test.", driverFirefox.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		
		driverFirefox.quit();	
	}
	
	@Test
	// This test should validate the interaction with elements of type Text Area
	public void interactionWithTextArea() {
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.manage().window().setSize(new Dimension(600, 800));
		driverFirefox.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driverFirefox.findElement(By.id("elementosForm:sugestoes")).sendKeys("Writing Test \n Test \n Test Test");
		Assert.assertEquals("Writing Test \n Test \n Test Test", driverFirefox.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		
		driverFirefox.quit();
	}
	
	@Test
	// This test should validate the interaction with elements of type Radio Button
	public void interactionWithRadioButton() {
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.manage().window().setSize(new Dimension(600, 800));
		driverFirefox.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		
	}
	
	@Test
	// This test should validate the interaction with elements of type TextBox
	public void interactionWithCheckBox() {
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.manage().window().setSize(new Dimension(600, 800));
		driverFirefox.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package antProject;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {
@Test
	public void antTest(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		driver.manage().window().maximize();
		System.out.println("Ant Program is running");
		driver.close();
	}
}

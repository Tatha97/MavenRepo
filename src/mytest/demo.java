package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.epam.healenium.SelfHealingDriver;

public class demo {

	
	WebDriver delegate;
	//SelfHealingDriver driver;
	@BeforeMethod
	public void setupDriver() {
try {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");
		delegate = new ChromeDriver();
		//driver= SelfHealingDriver.create(delegate);
}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	@Test
	public void test() {
		
		try{
			delegate.get("https://www.amazon.in/");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

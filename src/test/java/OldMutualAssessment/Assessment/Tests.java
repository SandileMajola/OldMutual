package OldMutualAssessment.Assessment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests
{
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void RunTest()
	{
		
	}
	
	@Before
	public void startup()
	{
		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		//Creating an object of ChromeDriver
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
}

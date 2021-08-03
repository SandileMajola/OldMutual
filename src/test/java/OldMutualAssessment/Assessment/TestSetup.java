package OldMutualAssessment.Assessment;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSetup {

	WebDriver driver;
		
	@Before
	public void startup()
	{
		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		//Creating an object of ChromeDriver
		driver = new ChromeDriver();
		
		driver.get("https://www.oldmutualfinance.co.za/");
		driver.manage().window().maximize();
	}
	
	@After
	public void TearDown()
	{
		//Quits the browser and all associated windows open
		driver.quit();
	}
}

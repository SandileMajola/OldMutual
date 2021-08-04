package OldMutualAssessment.Assessment;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSetup {

	WebDriver driver;
	
	//To Run on Firefox Browser, Please update browser to 'FIREFOX'
	String browser = "CHROME";
		
	@Before
	public void startup()
	{
		if(browser == "CHROME")
		{
			//Setting system properties of ChromeDriver
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

			//Creating an object of ChromeDriver
			driver = new ChromeDriver();
		}
		else if((browser == "FIREFOX"))
		{
			//Setting system properties of ChromeDriver
			System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

			//Creating an object of ChromeDriver
			driver = new ChromeDriver();
		}
		
		
		driver.get("https://www.oldmutualfinance.co.za/");
		driver.manage().window().maximize();
		
		//implicit wait when an element isn't interactable
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void TearDown()
	{
		//Quits the browser and all associated windows open
		driver.quit();
	}
}

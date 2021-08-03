package OldMutualAssessment.Selenium.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumCore {

	WebDriver driver;
	
	
	public SeleniumCore(WebDriver _driver)
	{
		//Dependency Injection
		driver = _driver;
	}
	
	
	public void Click(WebElement elementToClick)
	{
		elementToClick.click();
	}
	
	public void SelectValue(WebElement value)
	{
		
	}
	
	public void Navigate(String url)
	{
		driver.get(url);
	}
	
	public void WaitForElementVisible()
	{

	}
}

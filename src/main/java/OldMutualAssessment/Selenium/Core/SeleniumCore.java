package OldMutualAssessment.Selenium.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumCore {

	public void Click(WebElement elementToClick)
	{
		elementToClick.click();
	}
	
	public void Hover(WebElement elementToHover, WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).perform();
	}
}

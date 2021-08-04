package OldMutualAssessment.Selenium.Core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Functions extends SeleniumCore {
	
	WebDriver driver;
	
	public Functions(WebDriver _driver){
		
		//Dependency Injection
		driver = _driver;
	}
	
	//Navigate to Personal Loan Page
	public void NaviagteToPersonalPage()
	{
		WebElement lnkOurSolutions = driver.findElement(By.linkText("Our Solutions"));
		WebElement lnkPersonalLoan = driver.findElement(By.xpath("//span[text()='Personal Loans']"));
		
		Hover(lnkOurSolutions, driver);
		Click(lnkPersonalLoan);
	}
	
	//Select Amount on Personal Loan Page
	//Parameter : amount - Amount to select
	public void SelectAmount(String amount) throws InterruptedException
	{
		WebElement btnCalculate = driver.findElement(By.partialLinkText("CALCULATE"));
		Click(btnCalculate);
			
		Thread.sleep(5000); //wait for page to scroll, Update to use implicit wait
		
		WebElement drpAmount = driver.findElement(By.cssSelector("#loanAmount .selected-value-container"));		
		Click(drpAmount);
		
		WebElement drpValue = driver.findElement(By.id(amount));
		Click(drpValue);
		
		WebElement btnNext = driver.findElement(By.cssSelector("#undefined > .secondary-large"));
		Click(btnNext);
	}
	
	//Select Amount on Personal Loan Page
	//Parameter : duration - duration to select
	public void SelectPaymentDuration(String duration) throws InterruptedException
	{
		Thread.sleep(5000); //wait for page to scroll, Update to use implicit wait
		
		WebElement drpDuration = driver.findElement(By.cssSelector("#repaymentDuration .selected-value-container"));		
		Click(drpDuration);
		
		WebElement drpDurationValue = driver.findElement(By.id(duration));
		Click(drpDurationValue);
		
		WebElement btnCalculate = driver.findElement(By.cssSelector("#undefined > .primary-large > .om-button-text"));
		Click(btnCalculate);
		
	}
	
	//Gets Monthly Repayment 
	public String GetMonthlyRepayment() throws InterruptedException
	{
		Thread.sleep(5000); //Wait for the repayment amount to be loaded, Update to use implicit wait
		WebElement btnCalculate = driver.findElement(By.cssSelector(".no-bottom-margin:nth-child(2) > strong"));
		
		return(btnCalculate.getText());
	}
	
	public void TakeScreenShot(String fileWithPath)
	{
       TakesScreenshot scrShot =((TakesScreenshot)driver);
       File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

       File DestFile=new File(fileWithPath);

       try {
		FileUtils.copyFile(SrcFile, DestFile);
       } catch (IOException e) {

		e.printStackTrace();
	}
	}
}

package OldMutualAssessment.Assessment;

import org.junit.Test;
import org.junit.Assert;
import OldMutualAssessment.Selenium.Core.Functions;

public class Tests extends TestSetup
{
	@Test
	public void Scenario() throws InterruptedException
	{
		Functions functions = new Functions(driver);
		
		//step 1
		Assert.assertEquals("Page title is incorrect",driver.getTitle(),"Bank and Borrow Solutions | Old Mutual");
		functions.TakeScreenShot("c://step1.png");
		
		//step 2
		functions.NaviagteToPersonalPage();
		Assert.assertEquals("Page title is incorrect", driver.getTitle(),"Personal Loans | Apply Online | Old Mutual");
		functions.TakeScreenShot("c://step2.png");
		
		//step 3
		functions.SelectAmount("R50000");
		
		//step 4
		functions.SelectPaymentDuration("60 Months");
		
		//step 5
		Assert.assertEquals("Monthly Repayment is incorrect", "R1 656.43 - R1 810.05", functions.GetMonthlyRepayment());
		functions.TakeScreenShot("c://step3.png");
	}
}

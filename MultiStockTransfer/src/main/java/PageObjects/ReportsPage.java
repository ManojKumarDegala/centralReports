package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
  //public WebDriver driver;
	public ReportsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//WebElement list
	@FindBy(xpath="//span[text()='Reports']")
	public WebElement Reports;
	
	
	
	
	
	
	//WebElements actions
	
		public void ClickonReports() throws Throwable {
		   // Thread.sleep(5000);
			Reports.click();
		}
		
		
		
		//Actions for testcases
		public void Reports(WebDriver driver) throws Throwable {
			//Thread.sleep(5000);
			ClickonReports();
			driver.navigate().refresh();
			ClickonReports();
			
			
		}
	
	
	
}

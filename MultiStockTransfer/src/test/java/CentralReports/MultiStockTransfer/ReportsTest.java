package CentralReports.MultiStockTransfer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.ReportsPage;

public class ReportsTest {
	
	@Test
	public void Reports() throws Throwable {
		BaseClass b = new BaseClass();
		b.Login();
		ReportsPage RP = new ReportsPage(BaseClass.driver);
		RP.Reports(BaseClass.driver);

		
		
		
	}

}

package CentralReports.MultiStockTransfer;

import org.testng.annotations.Test;

import PageObjects.MultiStockTransferPage;

public class MultiStockTransfer {
	
	@Test
	public void Multistocktransfer() throws Throwable {
		BaseClass b = new BaseClass();
		b.Login();
	
	    MultiStockTransferPage MSTP = new MultiStockTransferPage(BaseClass.driver);
	
        MSTP.Multistocktransfer(BaseClass.driver);
	
	
	
	}
	
	
}

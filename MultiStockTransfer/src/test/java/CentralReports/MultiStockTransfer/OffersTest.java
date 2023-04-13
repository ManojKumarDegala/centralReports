package CentralReports.MultiStockTransfer;

import org.testng.annotations.Test;

import PageObjects.Offerspage;

public class OffersTest {
 
	@Test
	public void Createoffer() throws Throwable {
//		BaseClass b = new BaseClass();
//		b.Login();
		
		Offerspage Off = new Offerspage(BaseClass.driver);
		Off.Createoffers();
			
	}

}

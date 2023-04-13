package CentralReports.MultiStockTransfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class DataDriven {
	public static WebDriver driver;
	
	@Test
	public void Loginfromdatadriven() throws Throwable {
		
		    driver = new ChromeDriver();
		 // driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://reports.nukkadshops.com/new/");
		//	driver.get("http://staging.nukkadshops.com/new_central_dashboard/");
		//	driver.get("https://reports.nukkadshops.com/new/site/login");
			
			int i = 0;
			int j =0;
			LoginPage L= new LoginPage(driver);
		FileInputStream fis = new FileInputStream("D:\\CentralReports\\MultiStockTransfer\\DATA\\LOGIN IDS DATA DRIVEN.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
	//	Row r = sh.getRow();
	//	Cell c = r.getCell();
		
		for (i = 0; i<= 3; i++) {
	//		int input_1 = (i, 0);
	//	    int input_2 = (i, 1);
		    L.untb.sendKeys("input_1");
		    L.pwd.sendKeys("input_2");
		}
	
		L.login.click();	
	}
			
		
	}



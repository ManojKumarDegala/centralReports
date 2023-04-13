package CentralReports.MultiStockTransfer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
	 
	/**
	 * @author Admin
	 *
	 */
	public class ReadWriteExcel
	{
	    WebDriver driver;
	    WebDriverWait wait;
	    XSSFWorkbook workbook;
	    XSSFSheet sheet;
	    XSSFCell cell;
	 
	 @BeforeTest
	 public void TestSetup()
	{
	    // Set the path of the Firefox driver.
	   // System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
	    driver = new FirefoxDriver();
	     
	    // Enter url.
	    driver.get("https://reports.nukkadshops.com/new/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	 //   wait = new WebDriverWait(driver,30);
	 //   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	  
	 @Test
	 public void ReadData() throws IOException
	 {
	     // Import excel sheet.
	     File src=new File("D:\\CentralReports\\MultiStockTransfer\\DATA\\LOGIN IDS DATA DRIVEN.xlsx");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load the workbook.
	  //  workbook = new XSSFWorkbook(finput);
	    Workbook wb = WorkbookFactory.create(finput);
	      
	     // Load the sheet in which data is stored.
	  //   sheet= workbook.getSheetAt();
	     Sheet sh = wb.getSheet("Sheet1");
	     LoginPage L= new LoginPage(driver);
	     for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
	         // Import data for Email.
	         cell = sheet.getRow(i).getCell(1);
	         
	         cell.getStringCellValue();
	         cell.setCellValue(cell.getStringCellValue());
	         L.untb.sendKeys(cell.getStringCellValue());
	          
	         // Import data for password.
	         cell = sheet.getRow(i).getCell(2);
	         cell.getStringCellValue();
	         cell.setCellValue(cell.getStringCellValue());
	        //cell.setCellType(cell.CELL_TYPE_STRING);
	         L.pwd.sendKeys(cell.getStringCellValue());
	         L.login.click();
	          
	         // Write data in the excel.
	       FileOutputStream foutput=new FileOutputStream(src);
	         
	        // Specify the message needs to be written.
	        String message = "Data Imported Successfully.";
	         
	        // Create cell where data needs to be written.
	        sheet.getRow(i).createCell(3).setCellValue(message);
	          
	        // Specify the file in which data needs to be written.
	        FileOutputStream fileOutput = new FileOutputStream(src);
	         
	        // finally write content
	        workbook.write(fileOutput);
	         
	         // close the file
	        fileOutput.close();
	             
	     }
	 } 
	}


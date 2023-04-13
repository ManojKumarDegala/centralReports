//package CentralReports.MultiStockTransfer;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;
//
//import PageObjects.LoginPage;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class MultiStock{
//	WebDriver driver;
//@Test
//	public void Select() throws Throwable {
//	WebDriverManager.chromedriver().setup();
//	 driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://reports.nukkadshops.com/new/");
//	
//	LoginPage L= new LoginPage(driver);
//	L.login();
//		Thread.sleep(2000);
//Actions ac = new Actions(driver);
//		WebElement multi = driver.findElement(By.xpath("//span[text()=' Multi Stock Management']"));
//		ac.moveToElement(multi).click(multi).perform();
//		
//	}
//}

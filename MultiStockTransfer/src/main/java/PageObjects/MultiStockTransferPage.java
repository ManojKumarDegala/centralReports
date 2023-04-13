package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class MultiStockTransferPage {
	
	
	public MultiStockTransferPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()=' Multi Store Stock Transfer']")
	public WebElement MSST;
	
	@FindBy(xpath="//a[@href='/new/multistocktransfer/stocktransfer']")
	public WebElement Stocktransfer;
	
	@FindBy(xpath="//a[@href='/new/multistocktransfer/history']")
	public WebElement History;
	
//	@FindBy(id="select2-drop")
//	public WebElement Source;
	
	@FindBy(xpath="(//span[@class='select2-arrow'])[1]")
	public WebElement Source;
	
	@FindBy(xpath="//input[@id='s2id_autogen1_search']")
	public WebElement Search;
	
	@FindBy(xpath="//span[text()='Sahoo Test Store-']")
	public WebElement SelectStore;
	
	@FindBy(id="s2id_autogen2")
	//@FindBy(xpath="//input[@class='select2-input select2-default']")
	public WebElement Dest;
	
	@FindBy(xpath="(//span[@class='select2-arrow'])[2]")
	public WebElement Cat;
	
	@FindBy(xpath="//input[@id='s2id_autogen3_search']")
	public WebElement CatSearch;
	
	@FindBy(xpath="//button[@class='stkTransfr btn btn_search btn-sm']")
	public WebElement Searchbtn;
	
//	@FindBy(className="stkTransfr btn btn_search btn-sm")
//	public WebElement Searchbtn1;
	
//	@FindBy(xpath="//div[@class='select2-container select2-container-multi form-control userinput select2']")
//		public WebElement Dest2;
//	
//	@FindBy(id="s2id_dest_id")
//	public WebElement Dest1;
//	
//	@FindBy(xpath="//select[@id='dest_id']")
//	public WebElement SelectDest;
	
	
	
	
	
	//WebElements actions
	
	public void SelectMultistorestocktransfer() {
		MSST.click();
	}
	
	public void Selectstocktransfer() {
		Stocktransfer.click();
	}
	
	public void SelectHistory() {
		History.click();
	}
	
	public void SelectSource() {
		Source.click();
		Search.sendKeys("Sahoo", Keys.ENTER);
		//SelectStore.click();
	}
	
	public void Selectdest() {
		Dest.click();	
		Dest.sendKeys("Raghu", Keys.ENTER);
		Dest.sendKeys("Silar",Keys.ENTER);
		Dest.sendKeys("Jaanu", Keys.ENTER);
	
	}
	
	public void Selectcat() {
		Cat.click();
		CatSearch.sendKeys("Cookies",Keys.ENTER);
	}
	
	public void clicksearchbutton() {
		Searchbtn.click();
		
	}
	
	//Actions for testcases
	
	public void Multistocktransfer(WebDriver driver) {
		SelectMultistorestocktransfer();
		driver.navigate().refresh();
		SelectMultistorestocktransfer();
		Selectstocktransfer();
		SelectSource();
		Selectdest();
		//Selectcat();
		clicksearchbutton();
	}
	
	
	

}

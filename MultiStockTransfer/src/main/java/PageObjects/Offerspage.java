package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Offerspage {

	public Offerspage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	// WebElements list
	@FindBy(xpath="//span[text()='Offers']")
	public WebElement Offers;
	
	@FindBy(xpath="//button[@class='btn_top btn-sm']")
	public WebElement Create;
	
	@FindBy(xpath="//select[@id='offers-store_id']")
	public WebElement Selectstores;
	
	@FindBy(id="offers-name")
	public WebElement Offername;
	
	@FindBy(id="offers-offer_type_string")
	public WebElement Offertype;
	
	@FindBy(id="offers-desc")
	public WebElement Offersdesc;
	
	@FindBy(id="buy_products")
	public WebElement Buypro;
	
	@FindBy(xpath="//div[text()='1278903456459']")
	public WebElement SelectBuypro;
	
	@FindBy(xpath="//input[@class='qty']")
	public WebElement QTY;
	
	@FindBy(id="offer_products")
	public WebElement Offpro;
	
	@FindBy(id="offers-valid_from")
	public WebElement Validfrom;
	
	@FindBy(id="offers-valid_to")
	public WebElement Validto;
	
	@FindBy(xpath="//td[@class='day' and text()='15']")
	public WebElement day;
	
	@FindBy(id="create-offer-btn")
	public WebElement Submit;
	
	
	//WebElements actions
	
	public void Clickonoffers() throws Throwable {
	
		Offers.click();
	}
	
	public void Clickoncreate() throws Throwable {
	
		Create.click();
	}
	
	public void Clickonselectstore() {
		Select sel = new Select(Selectstores);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
	}
	
	public void Enteroffername() throws Throwable {
	
		Offername.sendKeys("BOGO");
	}
	
	public void Selectoffertype() throws Throwable {
		
		Select s = new Select(Offertype);
		s.selectByIndex(1);
	}
	
	public void Enterofferdesc() throws Throwable {
		
		Offersdesc.sendKeys("hi hello");
	}
	
	public void Selectoffproduct() throws Throwable {
		Offpro.sendKeys("soap");
		
		SelectBuypro.click();
		
	}
	
	public void EnterQty() throws Throwable {
	
	//	QTY.sendKeys("2");
	}
	
	public void Selectbuyproduct() throws Throwable {

		Buypro.sendKeys("soap");
	
		SelectBuypro.click();
	}
	
	public void Offervalidfrom() throws Throwable {
	
		Validfrom.click();
	}
	
	public void Offervalidto() throws Throwable {
	
		Validto.click();
	}
	
	public void Selectdate() throws Throwable {

		day.click();
	}
	
	public void Clickonsubitbtn() throws Throwable {
	
		Submit.click();
	}
	
	
	
	
	
	//Actions for testcases
	public void Createoffers() throws Throwable {
		Clickonoffers();
		Clickoncreate();
		Clickonselectstore();
		Enteroffername();
		Selectoffertype();
		Enterofferdesc();
		Selectbuyproduct();
		EnterQty();
		Selectoffproduct();
		Offervalidfrom();
		Selectdate();
		Offervalidto();
		Selectdate();
		Clickonsubitbtn();
		
		
	}

}

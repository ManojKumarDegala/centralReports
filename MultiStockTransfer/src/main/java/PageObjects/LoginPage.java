package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public  LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="loginform-username")
	public WebElement untb;
	
	@FindBy(id="loginform-password")
	public WebElement pwd;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement login;
	
	
	public void login() throws Throwable {
	    untb.sendKeys("admin2");
	  //  untb.sendKeys("gmradmin");
	
		pwd.sendKeys("admin2");
	//	pwd.sendKeys("123456");
	
		login.click();
	}
	

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginpage  {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='txtUsername']")
	public WebElement uname;
	@FindBy(xpath="//input[@name='txtPassword']")
	public WebElement pass;
	@FindBy(xpath="//input[@name='submit1']")
	public WebElement login;
	
	public loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public void doLogin(String username, String password) {
		
	uname.sendKeys(username);
	pass.sendKeys(password);
	login.click();
		}
	

}

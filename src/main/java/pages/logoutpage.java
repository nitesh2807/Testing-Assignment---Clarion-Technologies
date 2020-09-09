package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {

	
	@FindBy(xpath="//b[contains(text(),'LOGOUT')]")
	public WebElement logoutbtn;
	
	public logoutpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void logout() {
		logoutbtn.click();
		
	}
}

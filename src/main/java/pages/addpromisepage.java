package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.Elements;

public class addpromisepage extends Elements {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Log Promise')]")
	public WebElement clickbtn;
	
	@FindBy(xpath="//select[@name='cboEmp']")
	public WebElement dropdown;

	@FindBy(xpath="//textarea[@id='txtPromise']")
	public WebElement textfield;
	
	@FindBy(xpath="//input[@id='btnSubmit']")
	public WebElement submitbtn;
	
	public addpromisepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void addpromise() {
		clickbtn.click();
		Elements.selectByValue(dropdown, "4FD8CA8F7257FFE0BF0D13098D160895");
		textfield.sendKeys("Enter Promise hello world");
		submitbtn.click();
		
	}
	
	
	

}

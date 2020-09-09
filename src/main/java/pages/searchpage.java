package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.Elements;

public class searchpage {

	
	@FindBy(xpath="//select[@name='cboEmp']")
	public WebElement dropdown;
	
	@FindBy(xpath="//input[@name='btnSearch']")
	public WebElement btnSearch;
	
	public searchpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
		public void searchsection() {
			
			Elements.selectByValue(dropdown, "4FD8CA8F7257FFE0BF0D13098D160895");
			btnSearch.click();
			
		}
	}


package framework;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Elements {

	public static void selectByText(WebElement element,String text){
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static void selectByIndex(WebElement element,int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element,String value){
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	
	
	

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.addpromisepage;
import pages.loginpage;
import pages.logoutpage;
import pages.searchpage;

public class End2End extends BaseClass {
		
	
	@Test(priority=1)
	public void launchURL() {
		
		
		driver.get("http://182.74.238.221/clarion_promise_qa/home.php");
		driver.findElement(By.xpath("//input[@name='submit1']")).click();
		if(driver.getPageSource().contains("Invalid Username/password")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");}
		
		
	}
	@Test(priority=2)
	public void logintest() {
		
		loginpage login = new loginpage(driver);
		login.doLogin("sanjeetk@clariontechnologies.co.in", "clarion");
		
		
	
		
		
		
	}
	
	@Test(priority=3)
	public void addpromise() {
		
		addpromisepage promise = new addpromisepage(driver);
		promise.addpromise();
		/*driver.findElement(By.xpath("//a[contains(text(),'Log Promise')]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='cboEmp']"));
		Select s = new Select(dropdown);
		s.selectByValue("4FD8CA8F7257FFE0BF0D13098D160895");
		driver.findElement(By.xpath("//textarea[@id='txtPromise']")).sendKeys("Enter Promise helloqw");
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();*/
		
	}
	
	@Test(priority=4)
		public void search() {
		
		searchpage search = new searchpage(driver);
		search.searchsection();
		
		/*WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"cboEmp\"]"));
		Select s = new Select(dropdown);
		s.selectByValue("4FD8CA8F7257FFE0BF0D13098D160895");
			
		driver.findElement(By.xpath("//input[@name='btnSearch']")).click();*/
			
		}
	
	@Test(priority=5)
	public void logout() {
		logoutpage lp = new logoutpage(driver);
		lp.logout();
	}
	}
	



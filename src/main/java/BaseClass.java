import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;

	
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}

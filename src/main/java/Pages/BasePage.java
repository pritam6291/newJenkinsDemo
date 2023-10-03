package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePage {
	

		 

	    public static WebDriver driver;

	 

	    @BeforeSuite
	    public void setUp() throws InterruptedException {
	    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritamghosh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins");
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }
	    @AfterSuite
	    public void tearDown() {
	        driver.quit();
	    }
	}

	 

	    //public void navigateBack() {
	       // driver.navigate().back();
	    //}


	



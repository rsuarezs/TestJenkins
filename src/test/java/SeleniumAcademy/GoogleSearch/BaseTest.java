package SeleniumAcademy.GoogleSearch;

import java.util.concurrent.TimeUnit;
import org.junit.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import SeleniumAcademy.pages.SearchPage;

public class BaseTest {
	private static String baseUrl = "https://www.google.com/";
	public static WebDriver driver;
	private static SearchPage page = new SearchPage();
	
	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/academia/chromedriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@AfterClass
	public static void tearDown() throws Exception{
		driver.quit();
	}

}

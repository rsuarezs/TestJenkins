package SeleniumAcademy.GoogleSearch;
import org.openqa.selenium.chrome.*;
import org.junit.*;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import SeleniumAcademy.pages.*;


public class BasicSearch extends BaseTest{
	//private static SearchPage page = new SearchPage();
	private static String search;
	
	
	@Test
	public void fillTextBox() throws Exception{
		SearchPage.textbox_search(driver).sendKeys(search);
		//WebDriverWait wait = new WebDriverWait(driver,10);
	}

}

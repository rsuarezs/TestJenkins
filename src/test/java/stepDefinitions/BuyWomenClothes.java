package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;


public class BuyWomenClothes {
	WebDriver driver = setUpClass.driver; //se manda a llamar esta variable que es estatica en la clase SetUpClass
	Actions action;	
	JavascriptExecutor jsx =(JavascriptExecutor)driver;
	
	//cucumber es coo si se tuviera seteado aqui el main es por qeso que se tiene que idnicar el objeto
	
	
	@Given("landing to the loginpage and signin")
	public void user_on_login_page_andSignin() {
		
		
		driver.findElement(By.className("login")).click();
		
	}
	
	@When ("the user enters username and password as {string}{string}")
	public void username (String username,String password) {
		WebElement usernameLbl = driver.findElement(By.id("email"));
		usernameLbl.sendKeys(username);
		WebElement passwordLbl = driver.findElement(By.id("passwd"));
		passwordLbl.sendKeys(password);
	}
	
	
	//diferencia enrtre un  driver quit y driver close,
	//el quit mata la tarea  y el close unicamente cierra la ventana 
	
	@Then ("")
	
	
	@When ("buy women clothes")
	public void buy_women_clothes() {
		
		action = new Actions(driver);
		WebElement womenbutton = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]"));
		womenbutton.click();
		jsx.executeScript("window.scrollBy(0,950)", "");
		//*[@id='center_column']//ul[@class='product_list grid row']/li[1]/div/div[1]/div/a/img   xpath de la imagen
		//*[@id='center_column']//ul[@class='product_list grid row']/li[1]//div[@class='right-block']  xpath del segundo bloque
		//*[@id='center_column']//ul[@class='product_list grid row']/li[1]  todo el bloque
		//*[@id='center_column']//ul[@class='product_list grid row']/li[1]/div/div[2]/div[2]/a[1]  
		
		WebElement womencloth = driver.findElement(By.xpath("//*[@id='center_column']//ul[@class='product_list grid row']/li[1]"));
		WebElement womencloth2 = driver.findElement(By.xpath("//*[@id='center_column']//ul[@class='product_list grid row']/li[1]/div/div[2]/div[2]/a[1]"));
		action.moveToElement(womencloth).perform();
		action.moveToElement(womencloth2).perform();
		
		womencloth2.click();
	
}
	@When ("proceed checkout")
	public void proceed_to_checkout() {
		
		WebElement proceedcheckout = driver.findElement(By.xpath("//*[@id='layer_cart']//div[@class='button-container']/a"));
		proceedcheckout.click();
		WebElement proceedcheckout2 = driver.findElement(By.xpath("//*[@id='center_column']//p[@class='cart_navigation clearfix']/a[1]"));
		proceedcheckout2.click();
		WebElement proceedcheckout3 = driver.findElement(By.xpath("//*[@id='center_column']/form/p/button"));
		proceedcheckout3.click();
		WebElement agreetermschckbox = driver.findElement(By.id("cgv"));
		agreetermschckbox.click();
		
		WebElement proceedcheckout4 = driver.findElement(By.xpath("//*[@id='form']//button"));
		proceedcheckout4.click();
		
		//pagar con cheque
		WebElement proceedcheckout5 = driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[2]/div/p/a"));
		proceedcheckout5.click();
		
		WebElement proceedcheckout6 = driver.findElement(By.xpath("//*[@id='cart_navigation']/button"));
		proceedcheckout6.click();
		
	}
	
	@Then ("checkout finish")
	public void the_user_should_be_logged_correctly() {
		WebElement pageAssertion1 = driver.findElement(By.xpath("//*[@id='center_column']/p[1]"));
		pageAssertion1.getText().equals("Your order on My Store is complete.");
		driver.quit();
	
}
}

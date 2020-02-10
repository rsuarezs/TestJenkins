package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginSteps {
	
	//cucumber es coo si se tuviera seteado aqui el main es por qeso que se tiene que idnicar el objeto
	WebDriver driver = setUpClass.driver;
	
	@Given("the user is on the login page")
	public void user_on_login_page() {
		/*System.setProperty("webdriver.chrome.driver", "src//test//resources//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");*/
		
		driver.findElement(By.className("login")).click();
		
	}
	
	@When ("the user enters username as {string}")
	public void username (String username) {
		WebElement usernameLbl = driver.findElement(By.id("email"));
		usernameLbl.sendKeys(username);
	}
	
	@And ("the user enters password as {string}")
	public void password (String password) {
		WebElement passwordLbl = driver.findElement(By.id("passwd"));
		passwordLbl.sendKeys(password);
		}
	
	
	@When ("The user click on sign in button")
	public void the_user_click_on_sign_in_button() {
		
		WebElement signBtn = driver.findElement(By.id("SubmitLogin"));
		signBtn.click();
		}
	
	//diferencia enrtre un  driver quit y driver close,
	//el quit mata la tarea  y el close unicamente cierra la ventana 
	
	
	@Then ("the user should be logged correcty")
	public void the_user_should_be_logged_correctly() {
		WebElement pageAssertion = driver.findElement(By.className("page-heading"));
		pageAssertion.getText().equals("MY ACCOUNT");
		driver.quit();
}
	
}

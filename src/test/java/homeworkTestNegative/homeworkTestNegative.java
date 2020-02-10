package homeworkTestNegative;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import stepDefinitions.setUpClass;

public class homeworkTestNegative {
	
		WebDriver driver=setUpClass.driver;
	
		
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
		
		
		@Then ("the user must not log in")
		public void the_user_must_not_login() {
			WebElement pageAssertion = driver.findElement(By.xpath("//*[@id='center_column']/div[@class='alert alert-danger']/ol/li"));
			pageAssertion.getText().equals("Authentication failed.");
			driver.quit();
	}
		
		@Then ("the user must not log in empty")
		public void the_user_must_not_login_empty() {
			WebElement pageAssertion = driver.findElement(By.xpath("//*[@id='center_column']/div[@class='alert alert-danger']/ol/li"));
			pageAssertion.getText().equals("An email address required.");
			driver.quit();
	}
		
		@After
		public void tearDown() {
			driver.quit();
		}
		
	}

package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPageObjects {

    
    	public LogInPageObjects(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
        
        @FindBy(id = "SubmitLogin")
        WebElement signInButton;
        
        @FindBy(id="email")
        WebElement LogInUser;
        
        @FindBy(id="passwd")
        WebElement LogInPassword;
        
        public void Login() {
            signInButton.click();
        }
}

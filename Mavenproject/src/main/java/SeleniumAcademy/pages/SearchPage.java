package SeleniumAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	private static String searchBoxame= "q";
	private static String searchButton= "btnK";
	private static String imFeelingLuckyButtonName= "btnI";
	
	//se utiliza ese mismo metodo para no hacer llamdas directas al driver
	public static WebElement textbox_search(WebDriver driver) {
		return driver.findElement(By.name(searchBoxame));
	}
	
	public static WebElement button_search(WebDriver driver) {
		return driver.findElement(By.name(searchButton));
	}
	
	public static WebElement button_imfeelinglucky(WebDriver driver) {
		return driver.findElement(By.name(imFeelingLuckyButtonName));
	}

}
package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = "src/test/resources/Features", //busca el feature
			glue= {"stepDefinitions"} ,
			tags = "not @login" //indicar que los que tengan tag @login (es un tag global) no se ejecute
			)


public class LoginRunner extends AbstractTestNGCucumberTests{
	
}
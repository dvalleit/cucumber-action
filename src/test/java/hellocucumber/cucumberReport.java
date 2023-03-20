package hellocucumber;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 
// import org.junit.platform.suite.api.ConfigurationParameter;
// import org.junit.platform.suite.api.IncludeEngines;
// import org.junit.platform.suite.api.SelectClasspathResource;
// import org.junit.platform.suite.api.Suite;

// import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

public class cucumberReport { 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() { 
      driver = new FirefoxDriver();
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
      driver.navigate().to("https://www.facebook.com/"); 
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton() { 
      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail");
      }
   } 
	
   @Then("^Forgot password link should exist$") 
   public void forgotPWD() { 
      if(driver.findElement(By.id("")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else {
         System.out.println("Test 1 Fail");
      } 
   } 
}
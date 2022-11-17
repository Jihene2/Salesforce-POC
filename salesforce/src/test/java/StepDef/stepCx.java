package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import browserHelperAndUtils.Browserhelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.connexion;
import org.openqa.selenium.JavascriptExecutor;



public class stepCx {
	WebDriver driver;
	connexion log;
	
	
	@Given("Browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is open");



       String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectPath);



       System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");



       
    }



   @When("I navigate to salesforce page login")
    public void i_navigate_to_salesforce_page_login() throws Throwable {
        log = new connexion(driver);
        Browserhelper.driver=Browserhelper.initializeDriver(Browserhelper.driver);
        connexion.navigate(Browserhelper.driver);
        
        Thread.sleep(4000);
    }

	@When("I enter lOGIN")
	public void i_enter_l_ogin() throws Exception {
		
	    log.enterEmail(Browserhelper.driver);
	}

	@When("I enter PASSWORD")
	public void i_enter_password() throws Exception {
	    log.enterMdp(Browserhelper.driver);
	}

	@When("I Click on LOGIN")
	public void i_click_on_login() throws InterruptedException {
	   log.click_cx();
	   
	   
	   log.cliqueRappelU();
	   
	   //Thread.sleep(4000);
	   //((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[contains(@class,'slds-icon-waffle')]")));
	   
	   //driver.findElement(By.xpath("//div[contains(@class,'slds-icon-waffle')]")).click();Thread.sleep(2000);
	   //driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez des applications et des éléments...')]")).sendKeys("Ventes");
	}

	@Then("Home page should be open")
	public void home_page_should_be_open() {
	   
	}

	
}

package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDef.stepCx;
import browserHelperAndUtils.Browserhelper;
import Pages.CreatioContactPage;

public class stepCreationContact {
	stepCx stepCx;
	CreatioContactPage CreatioContactPage;
	
	@Given("User conected")
	public void user_conected() throws Throwable {
	CreatioContactPage= new CreatioContactPage(Browserhelper.driver);
	CreatioContactPage.seconnecter(Browserhelper.driver);

	}

	@When("I click on Contact")
	public void i_click_on_contact() throws Throwable {
		
		CreatioContactPage.accesSalesModule(Browserhelper.driver);

	}

	@When("I click on new contact")
	public void i_click_on_new_contact() {
	   
	}

	@When("I fill the field")
	public void i_fill_the_field() {
	   
	}

	@When("I save")
	public void i_save() {
	    
	}

	@Then("New contact should be created")
	public void new_contact_should_be_created() throws InterruptedException {
	   
		
		Thread.sleep(2000);
	}
	
	

}

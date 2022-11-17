package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browserHelperAndUtils.Browserhelper;

public class CreatioContactPage {
	public CreatioContactPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public static WebDriver driver;
	
	
	public void seconnecter(WebDriver driver) throws Throwable{



	       String projectPath = System.getProperty("user.dir");
	        System.out.println("Project path is : "+projectPath);
	        
	        Browserhelper.driver=Browserhelper.initializeDriver(Browserhelper.driver);
	        connexion.navigate(Browserhelper.driver);
	        //log.click_cx();
	        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");
	        connexion.enterEmail(Browserhelper.driver);
	        connexion.enterMdp(Browserhelper.driver);
	        Browserhelper.driver.findElement(By.xpath("//input[contains(@id,'Login')]")).click();
	        Browserhelper.driver.findElement(By.xpath("//a[contains(text(),'Me le rappeler ultérieurement')]")).click();
	        Thread.sleep(4000);
	        
	    }
	
	public void accesSalesModule(WebDriver driver) throws Throwable {
		
		Thread.sleep(6000);
		Browserhelper.driver.findElement(By.xpath("//div[contains(@class,'slds-icon-waffle')]")).click();
	    Thread.sleep(2000);
	    WebElement txt;
	    txt = Browserhelper.driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez des applications et des éléments...')]"));
	    Thread.sleep(2000);
	    txt.click();
	    txt.sendKeys("Ventes");
	    Thread.sleep(2000);
	    Browserhelper.driver.findElement(By.xpath("(//*[@class='slds-truncate']/b)[1]")).click();
	    Thread.sleep(5000);
		
		
		
	}
	
	
	
	

}

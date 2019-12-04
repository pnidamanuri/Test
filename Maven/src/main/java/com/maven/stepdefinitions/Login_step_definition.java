package com.maven.stepdefinitions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.maven.pageobjects.HomePage;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


	public class Login_step_definition{

		Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		static final String path = "D:\\Poorna Bkup\\Poorna\\Poorna Backup\\Softwares\\log4j\\log4j.properties";
		
	
		public HomePage homePage= new HomePage();
		
		public WebDriver driver;
		
		@Given("^user on home page$")
	    public void user_on_home_page() throws Throwable {
//			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
//		    driver = new FirefoxDriver();
		     
		    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		    driver.navigate().refresh();
		    driver.manage().deleteAllCookies();
          	driver.get("https://www.flipkart.com/");
          	
			APPLICATION_LOGS.debug("Application launched in Chrome browser");
	    }
		
		
		 @When("^Login to the application$")
		    public void login_to_the_application() throws Throwable {
		
			homePage=PageFactory.initElements(driver, HomePage.class);
				homePage.logindetails("9676609052", "Poorna@1");
		    }
		 
		 @Then("^I go to Iphone store$")
		    public void i_go_to_iphone_store() throws Throwable {
			 homePage=PageFactory.initElements(driver, HomePage.class);
				Thread.sleep(1000);
				 homePage.Ele.click();
				 Thread.sleep(1000);
				 homePage.Apple.click();
		    }
		 
		 @And("^I navigate to Samsung store and select Sansung J8$")
		    public void i_navigate_to_samsung_store_and_select_sansung_j8() throws Throwable {
			 homePage=PageFactory.initElements(driver, HomePage.class);
				Thread.sleep(1000);
				 homePage.Ele.click();
				 Thread.sleep(1000);
				 homePage.Samsung.click();
				 Thread.sleep(1000);
				 homePage.SamsungJ8.click();
		    }
		 
		 		 
		 @And("^I quit broswer$")
		    public void i_quit_broswer() throws Throwable {
		        driver.quit();
		    }

	
	}		
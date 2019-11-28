package com.xtivia.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.WebElement;



public class HomePage
{
	

@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
public
WebElement mob_num;

@FindBy(how=How.XPATH, using="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
public
WebElement pass;

@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
public
WebElement login;

@FindBy(how=How.XPATH, using="//input[@name='q']")
public
WebElement searchbox;

@FindBy(how=How.XPATH, using="//span[contains(text(),'Electronics')]")
public
WebElement Ele;

@FindBy(how=How.XPATH, using="//*[@title='Apple']")
public
WebElement Apple;

@FindBy(how=How.XPATH, using="//*[@title='Samsung']")
public
WebElement Samsung;

@FindBy(how=How.XPATH, using="//a[contains(text(),'Samsung J8')]")
public
WebElement SamsungJ8;



@FindBy(how=How.XPATH, using="//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[@class='Y5-ZPI']/form[@class='_1WMLwI header-form-search']/div[@class='col-12-12 _2tVp4j']/button[@class='vh79eN']/*[1]")
public
WebElement searchbutton;

public HomePage logindetails(String pno, String pswd)

{
	
	mob_num.sendKeys(pno);
	pass.sendKeys(pswd);
	login.click();
	
	
	return new HomePage();
}

public void search(String searc) throws InterruptedException 

{
	
	searchbox.sendKeys(searc);
	Thread.sleep(100000);
//	searchbox.sendKeys(Keys.ENTER);
	searchbutton.click();
	
	
	
}
}
package com.orangehrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrmadminpage {
	  WebDriver driver;

	    @FindBy(xpath = "//span[text()='Admin']")
	    WebElement adminmenu;

	    @FindBy(xpath = "//label[text()='Username']/following::input[1]")
	    WebElement usernamefield;

	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement searchbutton;

	    public Orangehrmadminpage(WebDriver driver) {

	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void clickAdmin() {
	        adminmenu.click();
	    }

	    public void searchuser(String username) {
	        usernamefield.sendKeys("Admin");
	        searchbutton.click();
	    }

}

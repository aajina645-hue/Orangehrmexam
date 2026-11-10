package com.orangehrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrmloginpage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement usernamefield;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement passwordfield;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginbutton;

    public Orangehrmloginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setValues(String username, String password) {
        usernamefield.sendKeys(username);
        passwordfield.sendKeys(password);
    }

    public void loginButtonClick() {
        loginbutton.click();
    }
}
package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;

import com.orangehrm.page.Orangehrmloginpage;

public class OrangehrmBaseclass {

    public Orangehrmloginpage lp;

    public WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @BeforeMethod
    public void mthd() {

        lp = new Orangehrmloginpage(driver);
    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}
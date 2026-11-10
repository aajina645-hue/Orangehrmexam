package com.orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.OrangehrmBaseclass;

public class Orangehrmloginpagetest extends OrangehrmBaseclass {

    @Test
    public void verifyLogin() {

        lp.setValues("Admin", "admin123");

        lp.loginButtonClick();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("dashboard"),
            "Login failed"
        );
    }
}
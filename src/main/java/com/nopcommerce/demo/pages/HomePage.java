package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

//    By loginLink = By.linkText("Log in");

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

//    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        Reporter.log("Clicking on Login Link " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on Login Link");
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Clicking on Register Link");
    }
}

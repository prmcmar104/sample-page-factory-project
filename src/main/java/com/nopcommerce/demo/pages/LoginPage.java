package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    //    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    //    By emailField = By.id("Email");

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    //    By passwordField = By.name("Password");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

//    By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

//    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        return message;
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        CustomListeners.test.log(Status.PASS, "Get errorMessage");
        return message;
    }
}

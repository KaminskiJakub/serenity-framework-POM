package com.automationpractice.components;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginComponent extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "passwd")
    private WebElementFacade passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElementFacade signInButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElementFacade invalidEmailOrPasswordError;

    public void typeEmailAddress(String email) {
        emailField.waitUntilClickable().sendKeys(email);
    }

    public void typePassword(String password) {
        passwordField.waitUntilClickable().sendKeys(password);
    }

    public void clickSubmitButton() {
        signInButton.waitUntilClickable().click();
    }

    public boolean isErrorMessageVisible() {
        return invalidEmailOrPasswordError.isVisible();
    }

    public boolean isEmailFieldVisible() {
        return emailField.isVisible();
    }

    public boolean isPasswordFieldVisible() {
        return passwordField.isVisible();
    }
}

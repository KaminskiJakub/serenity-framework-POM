package com.automationpractice.components;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HeaderComponent extends PageObject {

    @FindBy(className = "login")
    private WebElementFacade signInButton;

    @FindBy(className = "logout")
    private WebElementFacade signOutButton;

    @FindBy(xpath = "//a[@class='account' and contains(@href, 'controller=my-account')]")
    private WebElementFacade userName;

    public void clickSignInButton() {
        signInButton.waitUntilClickable().click();
    }

    public void clickSignOutButton() {
        signOutButton.waitUntilClickable().click();
    }

    public boolean isUsernameVisible() {
        return userName.isVisible();
    }

    public String getUsernameText() {
        return userName.getText();
    }
}

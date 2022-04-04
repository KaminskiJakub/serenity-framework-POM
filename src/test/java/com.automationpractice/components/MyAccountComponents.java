package com.automationpractice.components;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountComponents extends PageObject {

    @FindBy(xpath = "//div[@class='row addresses-lists']")
    private WebElementFacade optionList;

    public boolean isOptionListVisible() {
        return optionList.isVisible();
    }
}

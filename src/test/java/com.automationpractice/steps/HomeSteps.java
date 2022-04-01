package com.automationpractice.steps;

import com.automationpractice.components.HomePageComponent;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

    HomePageComponent homePageComponent;

    @Step
    public HomeSteps openHomePage() {
        homePageComponent.open();
        return this;
    }
}

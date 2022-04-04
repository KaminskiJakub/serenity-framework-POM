package com.automationpractice.stepdefinitions;

import com.automationpractice.steps.HeaderSteps;
import com.automationpractice.steps.HomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeStepDefs {

    @Steps
    HomeSteps homeSteps;

    @Steps
    HeaderSteps headerSteps;

    @Given("I am on home page")
    public void iAmOnHomePage() {
        homeSteps.openHomePage();
    }

    @When("I go to sign in section")
    public void iGoToSignInSection() {
        headerSteps.goToSignInSection();
    }
}

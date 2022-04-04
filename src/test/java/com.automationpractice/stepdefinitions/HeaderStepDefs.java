package com.automationpractice.stepdefinitions;

import com.automationpractice.steps.HeaderSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HeaderStepDefs {

    @Steps
    HeaderSteps headerSteps;

    @Then("I am logged in")
    public void iAmLoggedIn() {
        headerSteps.verifyThatISeeMyUserName();
    }

    @When("I sign out")
    public void iSignOut() {
        headerSteps.signOut();
    }
}

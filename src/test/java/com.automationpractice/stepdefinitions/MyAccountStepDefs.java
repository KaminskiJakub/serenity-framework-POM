package com.automationpractice.stepdefinitions;

import com.automationpractice.steps.MyAccountSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class MyAccountStepDefs {

    @Steps
    MyAccountSteps myAccountSteps;

    @And("I am on my account page")
    public void iAmOnMyAccountPage() {
        myAccountSteps.verifyThatUserIsOnMyAccountPage();
    }
}

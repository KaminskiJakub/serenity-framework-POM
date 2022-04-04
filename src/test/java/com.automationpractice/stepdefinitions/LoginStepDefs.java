package com.automationpractice.stepdefinitions;

import com.automationpractice.steps.LoginSteps;
import com.automationpractice.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefs {

    @Steps
    LoginSteps loginSteps;

    @And("I sign in with my credentials on login page")
    public void iSignInWithMyCredentialsOnLoginPage() {
        loginSteps.signIn(Constants.EMAIL, Constants.PASSWORD);
    }

    @And("^I sign in with wrong credentials: (.*) and (.*)$")
    public void iSignInWithWrongCredentials(String email, String password) {
        loginSteps.signIn(email, password);
    }

    @Then("there is error message present")
    public void there_is_error_message_present() {
        loginSteps.checkIfErrorMessageIsPresent();
    }

    @And("I am on login page")
    public void iAmOnLoginPage() {
        loginSteps.checkIfUserIsOnLoginPage();
    }
}

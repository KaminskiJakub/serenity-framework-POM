package com.automationpractice.stepdefinitions;

import com.automationpractice.steps.LoginSteps;
import com.automationpractice.utils.Constants;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefs {

    @Steps
    LoginSteps loginSteps;

    @And("I sign in with my credentials on login page")
    public void iSignInWithMyCredentialsOnLoginPage() {
        loginSteps.signIn(Constants.EMAIL, Constants.PASSWORD);
    }
}

package com.automationpractice.steps;

import com.automationpractice.components.LoginComponent;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginComponent loginComponent;

    @Step
     public void signIn(String email, String password) {
        typeEmailInRequiredField(email)
                .typePasswordInRequiredField(password)
                .submitCredentials();
    }

    @Step
    private LoginSteps typeEmailInRequiredField(String email) {
        loginComponent.typeEmailAddress(email);
        return this;
    }

    @Step
    private LoginSteps typePasswordInRequiredField(String password) {
        loginComponent.typePassword(password);
        return this;
    }

    @Step
    private void submitCredentials() {
        loginComponent.clickSubmitButton();
    }
}

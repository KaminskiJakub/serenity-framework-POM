package com.automationpractice.steps;

import com.automationpractice.components.LoginComponent;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    LoginComponent loginComponent;

    @Step
     public void signIn(String email, String password) {
        typeEmailInRequiredField(email)
                .typePasswordInRequiredField(password)
                .submitCredentials();
    }

    @Step
    public LoginSteps checkIfErrorMessageIsPresent() {
        assertThat(loginComponent.isErrorMessageVisible()).isTrue();
        return this;
    }

    @Step
    public void checkIfUserIsOnLoginPage() {
        assertThat(loginComponent.isEmailFieldVisible()).isTrue();
        assertThat(loginComponent.isPasswordFieldVisible()).isTrue();
    }

    private LoginSteps typeEmailInRequiredField(String email) {
        loginComponent.typeEmailAddress(email);
        return this;
    }

    private LoginSteps typePasswordInRequiredField(String password) {
        loginComponent.typePassword(password);
        return this;
    }

    private void submitCredentials() {
        loginComponent.clickSubmitButton();
    }
}

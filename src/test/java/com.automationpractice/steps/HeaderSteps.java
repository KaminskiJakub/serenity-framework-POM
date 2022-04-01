package com.automationpractice.steps;

import com.automationpractice.components.HeaderComponent;
import com.automationpractice.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class HeaderSteps {

    @Steps
    LoginSteps loginSteps;

    HeaderComponent headerComponent;

    @Step
    public LoginSteps goToSignInSection() {
        headerComponent.clickSignInButton();
        return loginSteps;
    }

    @Step
    public void verifyThatISeeMyUserName() {
        assertThat(headerComponent.isUsernameVisible()).isTrue();
        assertThat(headerComponent.getUsernameText()).isEqualTo(Constants.USERNAME);
    }
}

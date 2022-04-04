package com.automationpractice.steps;

import com.automationpractice.components.MyAccountComponents;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class MyAccountSteps {

    MyAccountComponents myAccountComponents;

    @Step
    public MyAccountSteps verifyThatUserIsOnMyAccountPage() {
        assertThat(myAccountComponents.isOptionListVisible()).isTrue();
        return this;
    }
}

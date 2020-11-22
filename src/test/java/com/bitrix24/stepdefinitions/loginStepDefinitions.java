package com.bitrix24.stepdefinitions;

import com.bitrix24.utilities.Driver;
import com.bitrix24.utilities.configurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinitions {
    @Given("user open login page")
    public void user_open_login_page() {
        String url = configurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("enter valid username and password")
    public void enter_valid_username_and_password() {


    }
    @When("user should click submit button")
    public void user_should_click_submit_button() {

    }
    @Then("user should be able to see landing page")
    public void user_should_be_able_to_see_landing_page() {

    }

}

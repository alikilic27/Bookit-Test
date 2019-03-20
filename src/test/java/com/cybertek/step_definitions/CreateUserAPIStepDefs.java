package com.cybertek.step_definitions;

import com.cybertek.utilities.BookITRestUtility;
import com.github.javafaker.Faker;
import cucumber.api.java.en.*;

public class CreateUserAPIStepDefs {

    @Given("the user has access token as a student")
    public void the_user_has_access_token_as_a_student() {
        String token = BookITRestUtility.getStudentToken();
        System.out.println("token = " + token);
    }

    @When("the user creates a new student")
    public void the_user_creates_a_new_student() {
        Faker faker = new Faker();

    }

    @Then("the new student should not be created")
    public void the_new_student_should_not_be_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}

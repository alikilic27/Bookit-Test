package com.cybertek.step_definitions;

import cucumber.api.java.en.Then;

public class BackendTestStepDefinitions {

    @Then("team information should match database records")
    public void team_information_should_match_database_records() {
       // get the excepted data from db
        //query which selects the people with the same team as our user
        // get the actual from UI
        //compare
    }

}

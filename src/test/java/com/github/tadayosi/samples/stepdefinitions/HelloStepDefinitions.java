package com.github.tadayosi.samples.stepdefinitions;

import com.github.tadayosi.samples.Greeting;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloStepDefinitions {
    private Greeting greeting;
    private String result;

    @Given("Greeting is present")
    public void greeting_is_present() {
        greeting = new Greeting();
    }

    @When("I send {string} to Greeting")
    public void send_to_greeting(String name) {
        result = greeting.hello(name);
    }

    @Then("I should get {string}")
    public void should_get_greeting(String greeting) {
        assertThat(result, is(greeting));
    }
}


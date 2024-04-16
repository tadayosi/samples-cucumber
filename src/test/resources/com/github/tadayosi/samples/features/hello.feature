Feature: Hello

  Scenario: Say hello
    Given Greeting is present
    When I send "Test" to Greeting
    Then I should get "Hello Test!"

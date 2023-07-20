@Parallel
Feature: First test case
  Scenario: TC_01 Sample Scenario
    Given I have a step "https://www.facebook.com/"
    Then I should see "Facebook - log in or sign up" a result
    When User enter email to facebook

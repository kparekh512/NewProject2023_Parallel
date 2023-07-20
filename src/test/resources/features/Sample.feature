@Parallel
Feature: First test case
  Scenario: TC_02 Sample Scenario
    Given I have a step "https://www.facebook.com/"
    Then I should see "Facebook - log in or sign up" a result
    When User enter email to facebook

  Scenario: TC_03 Test execution with same feature
    Given I have a step "https://www.instagram.com/"
    Then I should see "Instagram" a result
    When User enter email to instagram



@FirstFlow
Feature: Saucedemo first flow

  Background:
    Given the user is in the Saucedemo login screen

  Scenario Outline:  First flow
    When the user logs in with the "<usernames>" and the "<password>"
    And the user adds to cart the sauceLabs Backpack
    And the user proceeds to checkout
    And the user confirms the checkout
    And the user is logging out
    Then the user returns to the Saucedemo login screen

    Examples:
      | usernames     | password     |
      | standard_user | secret_sauce |

Feature: Full scenario

  @E2E @Positive @Functional
  Scenario: Login with valid credentials

    Given I am on MainPage
    When I click on Login
    And I enter email
    And I enter password
    And I click on login button
    When I search samsung from search bar
    Then I am on samsung category
    And  I navigate to second page
    And I add third product to favorites
    And I go to favorites list
    Then I verify product is added to favorites
    And I delete product
    Then I verify product is deleted



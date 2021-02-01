Feature: Gmail login page
  Scenario: Validate gmail login page when user and password both are valid
    Given User is in gmail login page
    When Enters valid user in User Field
    And Click next button
    And Enters valid password in password field
    And Click on next button to login
    Then Verify User is on email profile page
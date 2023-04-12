Feature: Login to Appointment

  @ValidCredentials
  Scenario Outline: Login Page
    When user is on registration page
    Then User enters "<username>" and "<password>"
    Then User click the login button
    And User should successfully login
    When User on Click on Customer Logo
    Then Click on Add Btn
    Then Fill All require field
    And Click on Save Btn

    Examples:
      | username | password |
      | administrator | administrator |







Feature: Login Page

  @ValidCredentials
  Scenario: Login with valid credentials

    Given User is on Home page
    When User enters username as "Admin"
    And User enters password as "admin123"
    Then User should be able to login successfully

  @InValidCredentials
  Scenario Outline: Login with invalid credentials

    Given User is on Home page
    When User enters username as '<username>'
    And User enters password as '<password>'
    Then User should be able to see error message '<errorMessage>'

    Examples:
      | username   | password  | errorMessage                      |
      | $$$$$      | ££££££££  | Invalid credentials               |
      | admin      | Admin123  | Invalid credentials               |
      | Admin123   | admin     | Invalid credentials               |
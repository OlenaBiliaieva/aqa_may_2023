Feature: As a user I want to login in app
  so that I can see my personal details

  @SmokeTest
  @RegressionTest
  Scenario: Unsuccessfully login
    Given I open login page
    When I fill login "elena@gmail.com"
    Then I see login field
    When I fill password "password1"
    And I click submit
    Then I see all is good

  @SmokeTest
  Scenario: Unsuccessful login
    Given I open login page
    When I fill password "password1"
    When I fill login "elena@gmail.com"
    And I click submit
    Then I see all is good
    When I pass int 10

  @RegressionTest
  Scenario Outline: Unsuccessfully login1
    Given I open login page
    When I fill login "<login>"
    And I fill password "<pass>"
    Then I see all is good
    When I pass int <id>

    Examples:
      | login          | pass | id |
      | Friday         | TGIF | 2  |
      | Sunday         | Nope | 2  |
      | anything else! | nOPE | 3  |

  @wip
  Scenario: Unsuccessfully login
    Given I open login page
    Then I see login field
    When I click submit


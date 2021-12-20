Feature: Selenium Cucumber Kotlin TestNG Example

  Scenario Outline: Google search
    Given User is on Google search page
    And number is <num> while name is "<name>"
    And new line
    When User searches for Selenium
    Then User can see Selenium results
    Examples:
      | num | name |
      | 55  | Anar |
      | 44  | Gulara |


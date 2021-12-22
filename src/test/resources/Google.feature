Feature: Selenium Cucumber Kotlin TestNG Example

  Rule: Simple test of complicated outline

    Scenario Outline: Google search

      Given User is on Google search page
      And number is <num> while name is "<name>"
      And new line
      When User searches for Selenium
      Then User can see Selenium results

      Examples: Normal
        | num | name |
        | 55  | Anar |
        | 44  | Gulara |

      Examples: Additional
        | num | name   |
        | 33  | Rustam |
        | 22  | Sattar |

      @edge-cases
      Examples: Edge
        | num | name |
        | -11 | 123  |
        | 0   | -@-  |


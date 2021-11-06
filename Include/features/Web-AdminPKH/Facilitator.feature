@tag
Feature: Facilitator feature
  Scenario featur for facilitator modul

  @tag1
  Scenario Outline: Login as a super admin
    Given User is on login page
    When Input data <username> and <password>
    Then User can see admin page

    Examples: 
      | username     | password |
      | e@dojobox.id | admin    |

  Scenario Outline: User can see detail facilitator 
    Given User already on page facilitator
    When User click modul facilitator and input field search with <name>
    Then User should see data list facilitator that have <name> and <email>

    Examples: 
      | name             | email                    |
      | Fadhil Rizqullah | fadilrizqullah@gmail.com |

  Scenario Outline: User can see list facilitator in page facilitator
    Given User already on page facilitator
    When User click modul facilitator and input field search with <name>
    Then User should see data list facilitator that have <name> and <email>

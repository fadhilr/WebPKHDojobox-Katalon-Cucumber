#@tag
Feature: Login feature

  @tag1
  Scenario Outline: Login as a super admin
    Given User is on login page
    When Input data <username> and <password>
    Then User can see admin page

    Examples: 
      | username     | password |
      | e@dojobox.id | admin    |

  Scenario Outline: Login as a super admin with wrong credentials
    Given User is on login page
    When Input data wrong <username> with <password>
    Then User can wrong credentials message

    Examples: 
      | username      | password |
      | e@dojoboxz.id | admin    |

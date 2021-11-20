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

  Scenario Outline: User can see list facilitator
  Given User already on page facilitator
  When User click modul facilitator and input field search with <email>
  Then User should see data list facilitator that have <name> and <email>
  
  Examples:
  | name             | email                    |
  | Fadhil Rizqullah | fadilrizqullah@gmail.com |
  
  Scenario Outline: User can see detail facilitator
  Given User already on page facilitator
  When User click modul facilitator and input field search with <name>
  And click detail button
  Then User should see data detail facilitator that have <name> and <email>
  
  Examples:
  | name             | email                    |
  | Fadhil Rizqullah | fadilrizqullah@gmail.com |
  Scenario Outline: User can add new facilitator
    Given User already on page facilitator
    When User click button tambah facilitator
    And Input data facilitator with <name>, <status>, <password>, <provinsi>, <kota>, <kecamatan>, <alamat> then save
    Then User should see data success add new facilitator pop up

    Examples: 
      | name       | status | password | provinsi | kota        | kecamatan | alamat     |
      | Create tes | Aktif  |     1234 | PAPUA    | KOTA SORONG | Sorong    | Jl. Sorong |

  Scenario Outline: User can edit facilitator
    Given User already on page facilitator
    When User search new facilitator by <email>
    And Edit data facilitator with <name>, <status>, <password>, <provinsi>, <kota>, <kecamatan>, <alamat> then save
    Then User should see pop up success edit data

    Examples: 
      | name             | email                    | status   | password | provinsi | kota       | kecamatan  | alamat    |
      | Fadhil Rizqullah | fadilrizqullah@gmail.com | Nonaktif |     1234 | RIAU     | KOTA DUMAI | Dumai Kota | Jl. Dumai |

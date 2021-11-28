@tag
Feature: Category feature
  I want to use this template for my feature file

  Scenario Outline: Login as a super admin
    Given User is on login page
    When Input data <username> and <password>
    Then User can see admin page

    Examples: 
      | username     | password |
      | e@dojobox.id | admin    |

  #Scenario Outline: User can see list category
  #Given User already on page category
  #When User click modul category and input field search with <title>
  #Then User should see data list category that have <title>
  #
  #Examples:
  #| title     |
  #| Badminton |
  #
  #Scenario Outline: User can add new main Category
  #Given User already on page category
  #When User click button tambah category
  #And Input main category with <icon>, <judul>, <deskripsi> and save
  #Then Pop up success add main category appear
  #
  #Examples:
  #| icon         | judul | deskripsi                                         |
  #| bug_icon.ico | Bug   | Category bug yang berisi berbagain macam serangga |
  #
  #Scenario Outline: User can edit main Category
  #Given User already on page category
  #When User click button edit category
  #And Edit main category with <icon>, <judul>, <deskripsi> and save
  #Then Pop up success edit main category appear
  #
  #Examples:
  #| icon         | judul    | deskripsi                                                          |
  #| bug_icon.ico | Bug edit | Category bug yang sudah diedit yang berisi berbagai macam serangga |
  Scenario Outline: User can add new sub Category
    Given User already on page category
    When User click button tambah sub category
    And Input sub category with <category>, <judul> and save
    Then User should see data success add new sub category pop up
    And See new sub category <judul> in list sub category

    Examples: 
      | category | judul                         |
      | Sample   | Bug jenis Teknologi Informasi |

  Scenario Outline: User can edit new sub Category
    Given User already on page category
    When User click button edit sub category
    And Edit sub category with <category>, <judul> and save
    Then User should see data success edit new sub category pop up

    Examples: 
      | category         | judul                                |
      | Keluarga Harapan | Bug jenis Teknologi Informasi diedit |

  Scenario: User can delete new sub Category
    Given User already on page category
    When User click button delete new sub category
    Then User should see success delete new sub category pop up

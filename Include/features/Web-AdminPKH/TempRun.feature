@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: User can add new facilitator
    Given User already on page facilitator
    When User click button tambah facilitator
    And Input data facilitator with <name>, <email>, <status>, <password>, <provinsi>, <kota>, <kecamatan>, <alamat> and save
    Then User should see data success add new facilitator pop up

    Examples: 
      | name       | email         | status | password | provinsi | kota        | kecamatan | alamat     |
      | Create tes | tes@gmail.com | Aktif  |     1234 | PAPUA    | KOTA SORONG | Sorong    | Jl. Sorong |

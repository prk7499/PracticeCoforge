Feature: Test Login Fuction of Freecrm

  Scenario: user login with valid credentials
    Given user is on loginpage
    When user enter "prafulp1010@gmail.com" and "Pr@ful0812"
    Then user validate homepage of freecrm

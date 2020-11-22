Feature: Bitrix login functionality


  @test
  Scenario: As a user I should be able to login with valid credential
    Given user open login page
    When enter valid username and password
    And user should click submit button
    Then user should be able to see landing page

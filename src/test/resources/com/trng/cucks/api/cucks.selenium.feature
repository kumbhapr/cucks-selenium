Feature: Testing with Web Page


  Background: 
  Given I print hello message

  
  Scenario: Verification of Github login with wrong credentials
    Given Open the Chrome and launch the application			
    When Enter the Github URL			
    And I enter credentials
    Then I click sign-in
    
  
  Scenario: PROD Verification of Github login with wrong credentials
    Given Open the Chrome and launch the application			
    When Enter the Github URL			
    And I enter credentials
    Then I click sign-in
  
  
  Scenario: Verification of Github login with wrong credentials
    Given Open the Chrome and launch the application			
    When Enter the Github URL			
    And I enter credentials
    Then I click sign-in
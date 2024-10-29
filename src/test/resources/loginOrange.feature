#auteur: Ines Joudi
Feature: Orange HRMlive Login Page

  Background: 
    Given Admin is on login page

  Scenario: Login with valid credential
    When Admin Enter correct username "Admin" and correct password "admin123"
    Then Admin is directed to the home page "Dashboard"

  Scenario: Login with invalid credential
    When Admin enter incorrect username "Ines" and correct password "admin123"
    Then admin is still on loginpage "Invalid credentials"

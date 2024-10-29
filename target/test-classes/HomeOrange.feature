#Author: Ines Joudi
Feature: home Page Orange

  Scenario Outline: 
    Given Admin est bien connectee avec username "Admin" et password "admin123"
    When Admin clique sur le menu "<menu>"
    Then Admin sur la page de menu cliquee "<menu>"

    Examples: 
      | menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |

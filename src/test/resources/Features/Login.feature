#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Title of your feature
  I want to use this template for my feature file

#se pueden poner varios tags en un solo escenario
  @tag1
  Scenario: Login correcto
    Given the user is on the login page
    When the user enters username as "test800@hotmail.com"
    And the user enters password as "test123"
    When The user click on sign in button
    Then the user should be logged correcty
    
      @tag2
  Scenario: Login credenciales erroneas
    Given the user is on the login page
    When the user enters username as "adsssd@hotmail.com"
    And the user enters password as "434355"
    When The user click on sign in button
    Then the user must not log in
    
    @tag2
  Scenario: Login con correo sin pass
    Given the user is on the login page
    When the user enters username as "adsssd@hotmail.com"
    And the user enters password as ""
    When The user click on sign in button
    Then the user must not log in
    
    @tag2
  Scenario: Login con pass sin correo
    Given the user is on the login page
    When the user enters username as ""
    And the user enters password as "434355"
    When The user click on sign in button
    Then the user must not log in
    
      @tag3
  Scenario: Login vacio
    Given the user is on the login page
    When the user enters username as ""
    And the user enters password as ""
    When The user click on sign in button
    Then the user must not log in empty
    

  
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
@tag
Feature: login y compra
  I want to use this template for my feature file

  @tag1
  Scenario: Login correcto
    Given the user is on the login page
    When the user enters username as "test800@hotmail.com"
    And the user enters password as "test123"
    When The user click on sign in button
    When buy women clothes
    When proceed checkout
    Then checkout finish

@user
Feature: Users
  As an admin
  I want to see list of user
  So that Ican see all users

  @user1
  Scenario Outline: GET - As Admin I have detail all users
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user
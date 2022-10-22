@user
Feature: Single Users
  As an admin
  I want to see list of Single Users
  So that Ican see all Single Users

  @user1
  Scenario Outline: GET - As Admin I have detail Single Users
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user
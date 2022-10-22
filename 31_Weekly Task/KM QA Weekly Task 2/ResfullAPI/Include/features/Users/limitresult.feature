@user
Feature: Limit result
  As an admin
  I want to see list of Limit result
  So that Ican see all Limit result

  @user1
  Scenario Outline: GET - As Admin I have detail Limit result
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user
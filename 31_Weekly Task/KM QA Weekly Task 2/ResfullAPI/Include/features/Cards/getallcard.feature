@user
Feature: Card
  As an admin
  I want to see list of card
  So that Ican see all card

  @user1
  Scenario Outline: GET - As Admin I have detail all card
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail card
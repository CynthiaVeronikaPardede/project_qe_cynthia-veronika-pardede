@tag
Feature: Product
  As an admin
  I want to see list of user
  So that Ican create new user

  @tag1
  Scenario Outline: GET - As Admin I have detail all product
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user
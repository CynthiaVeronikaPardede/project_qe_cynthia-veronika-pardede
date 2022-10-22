@login      
Feature: Login Feature

		@login1
    Scenario Outline: Success login

        Given Navigate to dasboard page
        When User click button login
        And User enter email <cynthiapardede17@gmail.com>
        And User click button selanjutnya
        And User enter password <Pardede123*>
        Then Click button Masuk
        
        
    Examples: 
      | email  										 | password    |
      | cynthiapardede17@gmail.com | Pardede123* |
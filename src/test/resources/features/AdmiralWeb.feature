@AdmiralWeb
Feature: Launch Admiral web and create a quote for motor

  @AdmiralWebLaunch
  Scenario Outline: Launch Admiral web and go for single car insurance
    Given I launch "Admiral" on "<Platform>"
    And I click on "MyAccount"

    #When I select "GetaQuote"
    #And I click on "SingleCarInsurance"
    #Then "CarInsurance" page should be displayed with title "Car Insurance"
    Examples: 
      | Platform |
      | Chrome   |

  @AdmiralWebLaunch2
  Scenario Outline: Launch Admiral web and go for single car insurance
    Given I launch "Admiral" on "<Platform>"
    And I click on "CarInsuranceLink"
    When I select "GetaQuote"
    And I click on "SingleCarInsurance"
    Then "CarInsurance" page should be displayed with title "Car Insurance"
    

    Examples: 
      | Platform |
      | Chrome   |

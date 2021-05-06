Feature: User should able to create a new client

  Scenario Outline: User should able to create a client as a person
    Given User should able to reach the CloudBankIn Application
    When User should able to click signin by providing "<userName>" and "<password>"
    And User should able to reach Homepage and select Clients Menu
    And User should able to reach the Clients page and click create Client button
    And User should able to reach the Client creation page,fill the required details and  enter "<firstName>","<lastName>","<mobileNo>","<dateOfBirth>","<street>","<email>"
    And User should able to select the activate button and enter activation date, then click submit
    And User should able to create a new loan and select the loan product for the client
    And User should able to enter the new loan application details
    And User should able to enter the loan terms "<principal>","<numofRepayments>","<nominalInterestRate>","<loanTerm>"

    Examples: 
      | userName         | password   | firstName | lastName | mobileNo   | dateOfBirth     | street       | email             | principal | numofRepayments | nominalInterestRate | loanTerm |
      | qatest@habile.in | Qatest123$ | Dummy1    | A        | 8454741829 | 29 October 1995 | DummyStreet1 | Dummy12@gmail.com |     15000 |               8 |                  12 |        9 |

      
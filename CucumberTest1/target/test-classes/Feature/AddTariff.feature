@regression
Feature: To Test add traffic plan

  @tag2
  Scenario Outline: 
    Given the user navigate to add customer page
    When The user fill in the valid details"<MRent>","<fLocal>","<FreeInMin>","<FreeSms>","<Localmin>","<Intermin>","<smsCharge>"
    And The User Click on Submit Buttons
    Then The user see the congradulation message

    Examples: 
      | MRent | fLocal | FreeInMin | FreeSms | Localmin | Intermin | smsCharge |
      |  1234 |     67 |       890 |     203 |       67 |      909 |        98 |
      | 23423 |   3453 |       876 |      98 |       98 |       45 |        12 |

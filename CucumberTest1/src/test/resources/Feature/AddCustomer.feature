Feature: To Test add Customer functionality

  @tag2 @us1
  Scenario Outline: To test you add customer plan sucessfully and generate the customer ID
    Given he user is in Telecom home page
    And The User click an add Customer
    When The User is filling all the details"<FName>","<LName>","<Email>","<Address>","<phone>"
    And The User Click on Submit Button
    Then The Customer Id Generated Sucessfully

    Examples: 
      | FName | LName  | Email          | Address          | phone      |
      | kalai | selvan | 123@gmail.com  | 123 West Street  | 1234567891 |
      | mani  | tamil  | 4567@gmail.com | 4567 test street | 9876543211 |

  @us2
  Scenario Outline: To test you add customer plan sucessfully and not generate the customer ID
    Given he user is in Telecom home page
    And The User click an add Customer
    When The User is invalid details to all the fields"<FName>","<LName>","<Email>","<Address>","<phone>"
    And The User Click on Submit Button
    Then The each filed error msg displayed

    Examples: 
      | FName | LName | Email | Address             | phone |
      |   123 |   345 |   123 | 123@,.              | KALAI |
      |   345 |   898 |  4567 | 4567,.& test street | jasm  |

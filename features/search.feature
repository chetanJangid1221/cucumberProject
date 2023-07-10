Feature: Search Products on Ebay

  Scenario Outline: Find Products
    Given I am on Ebay Home Page
    When I Search '<Item>' in '<Category>' Category

    Examples: 
      | Item | Category       |
      | car  | Toys & Hobbies |
      | Soap | Baby           |
      | port | Antiques       |

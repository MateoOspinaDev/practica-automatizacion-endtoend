Feature: Purchase
    As a registered user
    I want to add products to my shopping cart
    So that make a purchase

  Scenario: Purchase products from the shopping cart successfully
    Given Juan is authenticated
    And add form laptops a MacBook air
    And add form Monitor a Apple Monitor 24
    When Juan makes the purchase
    Then should see the message Thank you for your purchase
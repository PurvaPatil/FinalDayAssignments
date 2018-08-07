Feature: Buy Products from amazon.in
Scenario: Login
Given Open amazon.in site
When I add products to cart
Then products should be added to cart for payment


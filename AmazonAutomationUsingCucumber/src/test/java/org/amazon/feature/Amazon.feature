@AmazonApllication
Feature: Test end to end functionality of Amazon Application.

#Background: User launch the browser
#Given User should launch the browser and navigate to Amazon application
@TC1
Scenario: Verify user login for valid crendetials
#Given User should launch the browser and navigate to Amazon application
When  User mouseover to the Hello,SignIn text
And   User click on the SignIn button
And   User enter the Email or Mobile Phone Number 
And   User click the continue button
And   User enter the password in the textbox
And   User click the Login Button

@TC2
Scenario: Verify user do a product search 
#Given User mouseover to the Hello,SignIn text
#And   User click on the SignIn button
#And   User enter the Email or Mobile Phone Number 
#And   User click the continue button
#And   User enter the password in the textbox
#And   User click the Login Button
And   User enter product name in search box
And   User click the searched product item
And   User select the searched product and add to cart the product


@TC3
Scenario: Verify user place the order
#When  User mouseover to the Hello,SignIn text
#And   User click on the SignIn button
#And   User enter the Email or Mobile Phone Number 
#And   User click the continue button
#And   User enter the password in the textbox
#And   User click the Login Button
And    User click the Cart text
And    User click proceed to buy button 


@TC4
Scenario: Verify user select the address
And   User enter the full name
And   User enter the mobile no 
And   User enter the pincode
And   User enter the houseno
And   User enter the Area information
And   User click the Add Address button
And   User click continue button

@TC5
Scenario: Verify the user select the payment method
And User select the pay on delivery
#And  User before place the order click continue button

@TC6
Scenario: Verify user remove the product from the cart
And  User back to the home page
And  User click the Cart text
And  User click delete 








Feature: Nopcommerce Register

  Background:
    Given User able to open browser
    And Enter Url

    Scenario: Nopcommerce Valid Regitration test    // or User enter valid data
      Then User click on register link
      Then User on register page and verify register page title
      Then select gender as male
      Then enter first name and last name
      Then enter Date of birth
      Then enter email id
      Then enter company detail
      Then Uncheck  in newsletter field box
      Then enter Password
      Then enter confirm password
      Then click on register button
      Then user able to register succesfully.
      Then User close the Browser







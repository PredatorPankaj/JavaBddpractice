Feature:Login
  Scenario:Successful Login With Valid Credentials
    Given User Launch Chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login?"
    And User enters Email as "admin@yoursstore.com" and Password as"admin"
    And Click on login
    Then Pane Title Should be "Dashboard/nopcommerce administration"
    Then Pane Title should be "Your store. Login"
    And close browser

    
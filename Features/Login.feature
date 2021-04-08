Feature: verify  all the login functionality

  Scenario:verify login functionality with valid username and password

  Given  The browser  and url
    When  We enter valid username and password
    And  Click on login button
    Then Login should be successful



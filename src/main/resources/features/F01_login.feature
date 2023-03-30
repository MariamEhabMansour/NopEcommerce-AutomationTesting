@smoke
  Feature: Login_user login to the system
    Scenario: Login With valid data
      Given navigate to url
      And   Go to login page
      When  Enter valid email and valid password
      And   click on login button
      Then  verify the user login successfully


    Scenario: login with invalid email and valid password

      Given navigate to url
      And   Go to login page
      When  Enter invalid email and valid password
      And   click on login button
      Then  verify the user don't login successfully

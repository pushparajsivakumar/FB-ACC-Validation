Feature: To Validate the login Functionality of facebook application

Scenario: To validate login with valid username and invalid password
Given To launch the chrome browser and maximize window
When To launch the url of the facebook application
And To pass valid username in email field
And To pass invaild password in password field
And To click the login button
And To check whether navigate to the homepage or not 
Then To close the browser


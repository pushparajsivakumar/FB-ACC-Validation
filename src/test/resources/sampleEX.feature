Feature: To Validate the login Functionality of facebook application

Background:
Given To launch the chrome browser and maximize window


Scenario: To validate login with valid username and invalid password

When To launch the url of the facebook application
And To pass valid username in email field
And To pass invaild password in password field
And To click the login button
And To check whether navigate to the homepage or not 
Then To close the browser

Scenario Outline: To validate the positive and negative combination of login functionality

When  User has to hit the facebook url 
And User has to pass the data "<emaildatas>"in email field
And User has to pass the data "<passworddatas>"in password field 
And User has to pass the click on login button
Then User has to close the browser


Examples:
|emaildatas               |passworddatas|
|Seleniuminmakes@gmail.com|inmakes      |
|98pushparaj@gmail.com    |jagsgfsdgv   |
|darkskin@gmail.com       |8hfew89fd    |
|fbRammer@gmail.com       |823iuauayfeg |
|sam894@gmail.com         |8qy8rfjjbAKF |
|yammeee@gmail.com        |hjfhdcKJhvs  |

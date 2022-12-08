Feature: To validate the account creation of fb application

Scenario: To create a new account 
Given To Launch the browser and Maximize the window
When To launch the Url of fb  application
And To click the create new account button
# one Dimensional Datas in List
And To pass firstname in firstname textbox
|Selenium|Pushparaj|Suriya|Ashok|java|
And To pass secondname in secondname textbox
# Two Dimensional Dates in List
And To pass mobileno or email in email textbox
|9249773178|7481974178|6419837943|4189417388|
|seleniumInmakes@gmail.com|pushparaj98@gamil.com|sam34@gmail.com|AshokAnto@gmail.com|
And To create new password using new password text box
Then To close the chrome browser

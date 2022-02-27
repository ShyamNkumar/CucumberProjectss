Feature:Verifying Facebook Login
Scenario Outline:Verifying Facbook login with Valid Username and Password Credential
Given User On the Facebook Login Page
When User Should Enter valid "<Username>" and "<Password>"
When User Should Enter the Login Button
Then User Should Verify Success Button
Examples:
     |Username              |Password  |
     |Shyamnagu007@gmail.com|Sam@011090|
     |Sam                   |011092    |

# Use Case ID: #UC-1

## Use Case Name: Login

## Description
- The process of logging the user in the platform by adding his/her username and password

### Actors:
- User

### Stakeholders:
- Authentication Provider
- System

### Preconditions:
- User have stable internet connection.
- User must have an existing account.
- The system is working.

### Main Flow:
1. System ask for Credentials (username, password)
2. User Enters Credentials (username, password)
3. System Validates Credentials
4. Successful Login

### Alternative Flow:
1. User entered wrong password 3 times
2. User press on forgot password button
3. User is rerouted to a page to enter new password and confirm new password
4. User receives a mail with the confirmation that his password was changed
5. User is redirected to login page again to enter his credentials

### Postconditions:
1. User is transferred to the homepage
2. user is logged in and can use the functionalities of the app 

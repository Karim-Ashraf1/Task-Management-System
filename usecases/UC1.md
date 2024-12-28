# Use Case ID: #UC-1

## Use Case Name: Login to System

### Description
- The process of logging the user into the platform by verifying their username and password.

### Actors:
- Primary Actor: User
- Secondary Actor: Validation System

### Preconditions:
- User must have a stable internet connection.
- User must have an existing account.
- The system is operational.

### Main Flow:
1. System asks for credentials (username, password).
2. User enters credentials (username, password).
3. System validates credentials with the Validation System.
4. Upon success, the system logs the user in.

### Alternative Flow:
**Step 3: Validation Fails**
1. User enters incorrect credentials three times.
2. System prompts the user to reset their password.
3. User navigates to the password reset page and provides a new password.
4. System sends a confirmation email.
5. User logs in with the updated password.

### Postconditions:
- The user is redirected to the homepage and logged in to access the system's functionalities.

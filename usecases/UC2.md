# Use Case ID: #UC-2

## Use Case Name: Create Task

## Description
- This is for when a user wants to create a new task

### Actors:
- Primary Actor: User

### Stakeholders:
- User: Needs a way to organize and track tasks.
- Team Members: Tasks may be shared between team members

### Preconditions:
- The user must be logged into the system.
- The user has sufficient permissions to create a task.

### Main Flow:
1. The user clicks "Create Task".
2. The system displays a form for task creation.
3. The user fills in the required fields: title, description, due date, priority, and assignee.
4. The user clicks submit.
5. The system saves the task to the Local storage.
6. A success message is displayed to the user, and the task is added to the task list.

### Alternative Flow:
1. The user clicks "Create Task".
2. The system displays a form for task creation.
3. The user fills in the required fields: title, description, due date, priority, and assignee.
4. The user clicks submit.
5. The user submits the form with one or more required fields missing.
6. The system displays an error message indicating the missing fields.
7. The user corrects the input and resubmits the form.

### Postconditions:
1. A new task is successfully saved in the system.
2. The task is visible in the user's task list.

# Use Case ID: #UC-2

## Use Case Name: Create Task

### Description
- The user can create a new task by providing details such as title, description, and due date.

### Actors:
- Primary Actor: User
- Secondary Actor: Validation System

### Preconditions:
- User must be logged in.
- The system must be operational.

### Main Flow:
1. User selects the option to create a new task.
2. System prompts the user for task details (title, description, due date).
3. User enters the task details and submits them.
4. System validates the task details with the Validation System.
5. Upon validation success, the task is created and saved to the system.

### Alternative Flow:
**Step 4: Validation Fails**
1. The task details are missing required fields (e.g., title or description).
2. The system displays an error message and prompts the user to fill out all required fields.
3. The user corrects the information and resubmits the task.

### Postconditions:
- A new task is created and added to the task list in the system.

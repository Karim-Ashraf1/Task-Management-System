# Use Case ID: #UC-4

## Use Case Name: Edit Task

### Description
- The user can edit the details of an existing task, such as the title, description, or due date.

### Actors:
- Primary Actor: User
- Secondary Actor: Validation System

### Preconditions:
- User must be logged in.
- The task must exist in the system.
- The system must be operational.

### Main Flow:
1. User selects a task to edit.
2. System displays the current details of the task.
3. User modifies the task details (e.g., title, description, due date).
4. System validates the new task details with the Validation System.
5. Upon validation success, the task is updated in the system.

### Alternative Flow:
**Step 4: Validation Fails**
1. The modified task details are invalid (e.g., title is too short).
2. The system displays an error message and prompts the user to correct the issue.
3. User makes the necessary changes and resubmits the task.

### Postconditions:
- The task is updated with the new details in the system.

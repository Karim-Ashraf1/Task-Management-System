# Use Case ID: #UC-3

## Use Case Name: Delete Task

### Description
- The user can delete a task from the system.

### Actors:
- Primary Actor: User
- Secondary Actor: Validation System

### Preconditions:
- User must be logged in.
- The task must exist in the system.
- The system must be operational.

### Main Flow:
1. User selects a task to delete.
2. System prompts the user for confirmation.
3. User confirms the deletion.
4. System deletes the task from the task list.

### Alternative Flow:
**Step 3: User Cancels Deletion**
1. User chooses to cancel the deletion process.
2. The system returns to the task list view, and no changes are made.

### Postconditions:
- The task is removed from the task list in the system.

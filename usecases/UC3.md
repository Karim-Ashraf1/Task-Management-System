# Use Case ID: #UC-3

## Use Case Name: Delete Task

## Description
- This use case is for when users want to delete a task from the system.

### Actors:
- Primary Actor: User

### Stakeholders:
- User: Requires the ability to delete irrelevant, completed, or duplicate tasks. 
- Team Members: Need to stay informed about deleted tasks .
### Preconditions:
- The user must be logged into the system. 
- The task to be deleted must exist in the system. 
- The user must have sufficient permissions to delete the task.

### Main Flow:
1. The user is at the task list.
2. The user selects a task to delete.
3. The system prompts the user with a confirmation dialog to ensure they want to delete the task.
4. The user confirms the deletion
5. The system removes the task from the database
6. A success message is displayed to the user, and the task is removed from the task list.

### Alternative Flow:
1. The user is at the task list.
2. The user selects a task to delete.
3. The system prompts the user with a confirmation dialog to ensure they want to delete the task.
4. The user cancels the action.
5. The system does not delete the task, and it remains visible in the task list.

### Postconditions:
1. The task is permanently removed from the system and is no longer visible in the task list. 
2. Any team members linked to the task (e.g., as assignees) are notified of its deletion (if applicable).


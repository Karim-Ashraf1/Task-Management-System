# Use Case ID: #UC-5

## Use Case Name: Mark Task as Completed

### Description
- This use case describes the process of marking a task as completed by the user.

### Actors:
- **Primary Actor:** User

### Stakeholders:
- **User:** Wants to keep track of completed tasks and stay organized.
- **System:** Needs to update the task status and reflect the changes in the task list.

### Preconditions:
- The user must be logged into the system.
- The user must have a task that is currently incomplete.
- The task must be visible in the user's task list.

### Main Flow:
1. The user views the task list and selects a task they want to mark as completed.
2. The user clicks the "Mark as Completed" button next to the task.
3. The system updates the task status to "Completed."
4. A confirmation message is displayed to the user indicating that the task has been marked as completed.
5. The task is moved to the "Completed" section of the task list or visually marked as completed.

### Alternative Flow:
**Step 3: System Error**
1. The user views the task list and selects a task they want to mark as completed.
2. The user clicks the "Mark as Completed" button.
3. The system encounters an unexpected error (e.g., server issue or database failure) and cannot update the task status.
4. The system displays an error message to the user, indicating that the task could not be marked as completed due to a technical issue.
5. The user is given the option to retry marking the task as completed or cancel the operation.
6. The user retries and successfully marks the task as completed, or the user cancels and later decides to try again.

### Postconditions:
1. The task's status is updated to "Completed."
2. The task is visible in the completed tasks section or visually marked as done in the task list.

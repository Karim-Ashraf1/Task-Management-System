# Use Case ID: #UC-4

## Use Case Name: Edit Task 

## Description
- This use case allows the user to modify the details of an existing task, such as its title, description, priority, due date, or status. The purpose is to ensure the user can update tasks to reflect changes in requirements or priorities.
### Actors:
- User

### Stakeholders:
- User

### Preconditions:
- There must be at least one task in the system
- The task to be edited must be selected from the list of tasks

### Main Flow:
1. The user goes to the task list
2. The user selects the task they wish to edit
3. The system displays the task's details with an edit button
4. The user clicks on edit
5. The user updates the task
6. The user clicks on save button
7. The system checks if the edit is valid (eg. no empty fields)


### Alternative Flow:
   #### Input Validation Fails:
     1. The user enters empty fields or wrong due date
     2. The system displays an error message according to the error
   #### Edit Cancel:
     1. The user clicks on cancel edit
     2. The system closes the edit interface withot saving changes 
   


### Postconditions:
1. The system saves the task in the local storage
2. The system updates the task

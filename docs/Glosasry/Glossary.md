# Glossary for Task Management System

## Revision History

| Version | Date       | Description | Author |
|---------|------------|-------------|--------|
| 1.0     | 2024-11-24 | Phase 1     | Karim  |
| 2.0     | 2024-12-31 | Phase 2     | Karim  |

---

## Terms and Definitions

| Term       | Definition                                                                 | Format                 | Validation Rules                  | Aliases                  |
|------------|-----------------------------------------------------------------------------|------------------------|-----------------------------------|--------------------------|
| Task       | A unit of work to be completed, which can be created, assigned, tracked.   | Alphanumeric (max 255) | Required; Must have title and status. | Job, Assignment         |
| Status     | The current state of a task.                                               | Enum (To Do, In Progress, Done) | Acceptable values: To Do, In Progress, Done | State, Progress         |
| Assignee   | The user responsible for completing a task.                                | Alphanumeric (max 100) | Must match an existing user.      | Responsible User, Task Owner |
| Due Date   | The date by which a task must be completed.                                | Date (YYYY-MM-DD)      | Cannot be a past date.            | Deadline                 |
| Priority   | The level of importance of a task.                                         | Enum (Low, Medium, High) | Acceptable values: Low, Medium, High | Urgency, Importance Level |
| User       | An individual who interacts with the system.                               | Alphanumeric (max 50)  | Must be unique in the system.     | Account Holder           |
| Notification | A system-generated alert to inform users of task updates.                | Alphanumeric (max 500) | Optional                          | Alert, Reminder          |

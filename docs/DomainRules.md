### **Domain Rules**

| ID  | Rule                                                                  | Changeability           | Source                        |
|-----|-----------------------------------------------------------------------|-------------------------|-------------------------------|
| 1   | Each task must have a unique identifier.                             | Low                     | System Design                |
| 2   | Tasks must have a title.                                              | Low                     | Stakeholder Requirements     |
| 3   | Tasks must have a status (`TODO`, `IN_PROGRESS`, `DONE`).             | Medium                  | Workflow Guidelines          |
| 4   | Tasks must have a due date specified at creation.                     | High                    | Task Management Guidelines   |
| 5   | Tasks must include a description.                                     | Medium                  | User Experience Guidelines   |
| 6   | Users can delete tasks by providing their ID.                         | Low                     | System Design                |
| 7   | The system must use a persistence layer to store tasks.               | Low                     | System Design                |
| 8   | Task updates must include a timestamp.                                | Medium                  | Audit Requirements           |
| 9   | Tasks are managed using a RESTful API.                                | Low                     | Architectural Guidelines     |
| 10  | The system uses the Singleton design pattern for the repository.      | Low                     | Architectural Guidelines     |
| 11  | The system uses the Factory Method pattern for task creation.         | Low                     | Design Principles            |
| 12  | Tasks are notified when changes occur (Observer pattern).             | Medium                  | Collaboration Guidelines     |


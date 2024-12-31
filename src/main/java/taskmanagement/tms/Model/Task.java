package taskmanagement.tms.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
/// The entity class representing a task in the database.
@Setter
@Getter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate task IDs
    private Long id;

    private String title; // Title of the task
    private String description; // Description of the task

    @Enumerated(EnumType.STRING)
    private Status status; // Task status (TODO, IN_PROGRESS, DONE)

    private String assignee; // Person responsible for the task
    private LocalDate dueDate; // Due date for the task

    public enum Status {
        TODO, IN_PROGRESS, DONE // Enumeration of possible task statuses
    }
}

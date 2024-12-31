package taskmanagement.tms.Factory;

import taskmanagement.tms.Model.Task;

import java.time.LocalDate;

/// Factory class to create predefined task templates based on input.
public class TaskFactory {

    public static Task createTemplateTask(String templateType) {
        Task task = new Task();

        switch (templateType.toUpperCase()) {
            case "MEETING":
                // Predefined template for a meeting task
                task.setTitle("Team Meeting");
                task.setDescription("Discuss project updates");
                task.setStatus(Task.Status.TODO);
                task.setDueDate(LocalDate.now().plusDays(1));
                break;

            case "BUG":
                // Predefined template for a bug fix task
                task.setTitle("Bug Fix");
                task.setDescription("Resolve reported bug");
                task.setStatus(Task.Status.TODO);
                task.setDueDate(LocalDate.now().plusDays(2));
                break;

            default:
                // Default template for generic tasks
                task.setTitle("General Task");
                task.setDescription("Default task description");
                task.setStatus(Task.Status.TODO);
                task.setDueDate(LocalDate.now().plusDays(3));
                break;
        }

        return task; // Returns the created task template
    }
}

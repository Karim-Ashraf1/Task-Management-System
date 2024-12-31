package taskmanagement.tms.Util;

import taskmanagement.tms.Model.Task;

import org.springframework.stereotype.Component;

@Component
/// This utility class acts as an observer to monitor and respond to status changes in tasks.
public class StatusUpdateObserver {

    public void onStatusChange(Task task) {
        // Logs a message when a task's status changes
        System.out.println("Task with ID: " + task.getId() + " status changed to " + task.getStatus());
    }
}

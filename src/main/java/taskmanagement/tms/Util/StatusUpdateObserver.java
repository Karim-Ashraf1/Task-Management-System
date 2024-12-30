package taskmanagement.tms.Util;

import taskmanagement.tms.Model.Task;

import org.springframework.stereotype.Component;

@Component
public class StatusUpdateObserver {

    public void onStatusChange(Task task) {
        System.out.println("Task with ID: " + task.getId() + " status changed to " + task.getStatus());
    }
}

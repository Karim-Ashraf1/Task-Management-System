package taskmanagement.tms.Services;

import taskmanagement.tms.Util.Logger;
import org.springframework.stereotype.Service;

/// Service to log task creation and deletion actions.
@Service
public class TaskLoggerService {

    private final Logger logger = Logger.getInstance(); // Singleton logger instance

    public void logTaskCreation(String taskTitle) {
        // Logs task creation details
        logger.log("Task created: " + taskTitle);
    }

    public void logTaskDeletion(Long taskId) {
        // Logs task deletion details
        logger.log("Task deleted: ID = " + taskId);
    }
    public void logTaskEdit(String taskTitle) {
        // Logs task Edit details
        logger.log("Task Edited = " + taskTitle);
    }
}

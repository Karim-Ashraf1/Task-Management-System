package taskmanagement.tms.Services;

import taskmanagement.tms.Util.Logger;
import org.springframework.stereotype.Service;

@Service
public class TaskLoggerService {

    private final Logger logger = Logger.getInstance();

    public void logTaskCreation(String taskTitle) {
        logger.log("Task created: " + taskTitle);
    }

    public void logTaskDeletion(Long taskId) {
        logger.log("Task deleted: ID = " + taskId);
    }
}

package taskmanagement.tms.Services;

import taskmanagement.tms.Factory.TaskFactory;
import taskmanagement.tms.Model.Task;
import taskmanagement.tms.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/// Service to create tasks, including tasks from templates.
@Service
public class TaskCreationService {

    @Autowired
    private TaskRepository taskRepository; // Repository for database operations

    public Task createTaskFromTemplate(String templateType) {
        // Creates a task using the TaskFactory and saves it to the database
        Task task = TaskFactory.createTemplateTask(templateType);
        return taskRepository.save(task);
    }
}

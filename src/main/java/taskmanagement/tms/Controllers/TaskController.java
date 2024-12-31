package taskmanagement.tms.Controllers;

import taskmanagement.tms.Model.Task;
import taskmanagement.tms.Services.TaskCreationService;
import taskmanagement.tms.Services.TaskLoggerService;
import taskmanagement.tms.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskmanagement.tms.Services.TaskService;

import java.util.List;

///  This is the main REST controller that handles API requests related to task management.

@RestController
@RequestMapping("/tasks") // Base endpoint for tasks
public class TaskController {

    @Autowired
    private TaskRepository taskRepository; // Repository for database operations

    @Autowired
    private TaskCreationService taskCreationService; // Service for creating tasks from templates

    @Autowired
    private TaskLoggerService taskLoggerService; // Service for logging task-related actions

    @Autowired
    private TaskService taskService; // TaskService is injected here



    @GetMapping
    public List<Task> getAllTasks() {
        // Fetches all tasks from the database
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        // Logs the task creation and saves the new task to the database
        taskLoggerService.logTaskCreation(task.getTitle());
        return taskService.createTask(task);
    }

    @PostMapping("/template/{templateType}")
    public Task createTaskFromTemplate(@PathVariable String templateType) {
        // Creates a task using a predefined template and logs it
        Task task = taskCreationService.createTaskFromTemplate(templateType);
        taskLoggerService.logTaskCreation(task.getTitle());
        return task;
    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        taskLoggerService.logTaskEdit(updatedTask.getTitle());
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        // Deletes a task by ID and logs the deletion
        taskService.deleteTask(id);
        taskLoggerService.logTaskDeletion(id);
    }
}

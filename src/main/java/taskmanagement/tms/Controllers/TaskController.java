package taskmanagement.tms.Controllers;

import taskmanagement.tms.Model.Task;
import taskmanagement.tms.Services.TaskCreationService;
import taskmanagement.tms.Services.TaskLoggerService;
import taskmanagement.tms.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskCreationService taskCreationService;

    @Autowired
    private TaskLoggerService taskLoggerService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        taskLoggerService.logTaskCreation(task.getTitle());
        return taskRepository.save(task);
    }

    @PostMapping("/template/{templateType}")
    public Task createTaskFromTemplate(@PathVariable String templateType) {
        Task task = taskCreationService.createTaskFromTemplate(templateType);
        taskLoggerService.logTaskCreation(task.getTitle());
        return task;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
        taskLoggerService.logTaskDeletion(id);
    }
}

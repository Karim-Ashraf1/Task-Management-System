package taskmanagement.tms.Services;

import taskmanagement.tms.Model.Task;
import taskmanagement.tms.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/// This service provides business logic for managing tasks, including CRUD operations.
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository; // Repository for database interaction

    public List<Task> getAllTasks() {
        // Fetches all tasks from the database
        return taskRepository.findAll();
    }

    public Task createTask(Task task) {
        // Saves a new task to the database
        return taskRepository.save(task);
    }



        public Task updateTask(Long id, Task updatedTask) {
            return taskRepository.findById(id).map(task -> {
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                task.setStatus(updatedTask.getStatus());
                task.setAssignee(updatedTask.getAssignee());
                task.setDueDate(updatedTask.getDueDate());
                return taskRepository.save(task);
            }).orElseThrow(() -> new RuntimeException("Task not found"));
        }



    public void deleteTask(Long id) {
        // Deletes a task by its ID
        taskRepository.deleteById(id);
    }
}

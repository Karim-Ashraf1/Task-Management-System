package taskmanagement.tms.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import taskmanagement.tms.Model.Task;
import taskmanagement.tms.Services.TaskService;

import java.time.LocalDate;

@Controller
@RequestMapping("/tasks-view")
public class TaskViewController {

    @Autowired
    private TaskService taskService;

    // Display the task list
    @GetMapping
    public String getTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "taskView"; // Refers to the Thymeleaf template "taskView.html"
    }

    // Display the form to edit an existing task
    @GetMapping("/edit")
    public String editTask(@RequestParam("taskId") Long id, Model model) {
        Task task = taskService.getTaskById(id);
        model.addAttribute("editTask", task); // Populate the form with the existing task data
        model.addAttribute("tasks", taskService.getAllTasks()); // Include the task list
        return "taskView";
    }

    // Handle form submission to create or update a task
    @PostMapping("/save")
    public String saveTask(
            @RequestParam(value = "taskId", required = false) Long id,
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("dueDate") String dueDate,
            @RequestParam("status") String status,
            @RequestParam("assignee") String assignee) {

        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setDueDate(LocalDate.parse(dueDate));
        task.setStatus(Task.Status.valueOf(status));
        task.setAssignee(assignee);

        if (id == null) {
            // Create a new task if no ID is provided
            taskService.createTask(task);
        } else {
            // Update an existing task
            taskService.updateTask(id, task);
        }

        return "redirect:/tasks-view";
    }

    // Handle task deletion
    @PostMapping("/delete")
    public String deleteTask(@RequestParam("taskId") Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks-view";
    }
}

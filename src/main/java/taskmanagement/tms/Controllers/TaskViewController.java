package taskmanagement.tms.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import taskmanagement.tms.Repositories.TaskRepository;

///  This controller handles the view rendering for the task management system using Thymeleaf.
/// But we failed to implement it.
@Controller
public class TaskViewController {

    @Autowired
    private TaskRepository taskRepository; // Used to fetch tasks from the database

    @GetMapping("/view/tasks")
    public String showTaskList(Model model) {

        // Adds the list of tasks to the model to be displayed on the UI
        model.addAttribute("tasks", taskRepository.findAll());
        return "index"; // Maps to the Thymeleaf template "index.html"
    }
}

package taskmanagement.tms.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import taskmanagement.tms.Repositories.TaskRepository;

@Controller
public class TaskViewController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/view/tasks")
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        return "index"; // This corresponds to index.html in the templates folder
    }
}

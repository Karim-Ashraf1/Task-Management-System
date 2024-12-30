package taskmanagement.tms.Services;

import taskmanagement.tms.Factory.TaskFactory;
import taskmanagement.tms.Model.Task;
import taskmanagement.tms.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskCreationService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTaskFromTemplate(String templateType) {
        Task task = TaskFactory.createTemplateTask(templateType);
        return taskRepository.save(task);
    }
}

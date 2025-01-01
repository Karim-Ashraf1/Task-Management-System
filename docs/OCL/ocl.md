# OCL Constraints

## Task Constraints

### Context: Task
- `inv: self.title->notEmpty()`
- `inv: self.description->notEmpty()`
- `inv: self.status in Sequence{'To Do', 'In Progress', 'Done'}`
- `inv: Task.allInstances()->isUnique(task | task.id)`

### Context: Task::updateStatus(newStatus: String)
- `pre: newStatus in Sequence{'To Do', 'In Progress', 'Done'}`
- `post: self.status = newStatus`

---

## TaskRepository Constraints

### Context: TaskRepository
- `inv: self.tasks->forAll(task | task.id->isUnique())`
- `inv: self.tasks->size() >= 0`

---

## TaskCreationService Constraints

### Context: TaskCreationService::createTaskFromTemplate(templateType: String)
- `pre: templateType in Sequence{'Simple', 'Detailed'}`
- `post: result.title->notEmpty() and result.description->notEmpty()`

---

## TaskLoggerService Constraints

### Context: TaskLoggerService
- `inv: self.logs->size() >= 0`

### Context: TaskLoggerService::logTaskCreation(taskTitle: String)
- `pre: taskTitle->notEmpty()`
- `post: self.logs->size() = self.logs->size()@pre + 1`

### Context: TaskLoggerService::logTaskDeletion(taskId: Long)
- `pre: taskId > 0`
- `post: self.logs->size() = self.logs->size()@pre + 1`

---

## TaskController Constraints

### Context: TaskController::createTask(task: Task)
- `pre: task.title->notEmpty() and task.description->notEmpty()`
- `post: TaskRepository.tasks->includes(task)`

### Context: TaskController::deleteTask(taskId: Long)
- `pre: taskId > 0 and TaskRepository.tasks->exists(task | task.id = taskId)`
- `post: TaskRepository.tasks->excludes(task | task.id = taskId)`

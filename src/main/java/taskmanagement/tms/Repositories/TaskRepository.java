package taskmanagement.tms.Repositories;

import taskmanagement.tms.Model.Task ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

package taskmanagement.tms.Repositories;
/// Repository interface for performing CRUD operations on Task.
import taskmanagement.tms.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // JpaRepository provides built-in methods like save, delete, findById, and findAll
}

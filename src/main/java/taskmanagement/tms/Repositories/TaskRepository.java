package taskmanagement.tms.Repositories;
/// Repository interface for performing CRUD operations on Task.
import org.springframework.stereotype.Repository;
import taskmanagement.tms.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // JpaRepository provides built-in methods like save, delete, findById, and findAll
}

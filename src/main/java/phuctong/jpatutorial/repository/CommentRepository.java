package phuctong.jpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phuctong.jpatutorial.entity.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
}

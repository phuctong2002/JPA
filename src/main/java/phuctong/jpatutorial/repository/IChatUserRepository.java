package phuctong.jpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import phuctong.jpatutorial.entity.ChatUser;


@Repository
public interface IChatUserRepository extends JpaRepository<ChatUser, String> {
}

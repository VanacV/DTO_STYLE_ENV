package source.training_env.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.training_env.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

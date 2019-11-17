package bet.ru.sarafan.repo;

import bet.ru.sarafan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDelailsRepo extends JpaRepository<User, String> {
}

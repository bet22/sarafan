package bet.ru.sarafan.repo;

import bet.ru.sarafan.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message,Long> {
}

package Jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Jpa.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
}

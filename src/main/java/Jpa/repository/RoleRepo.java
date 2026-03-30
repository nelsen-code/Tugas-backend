package Jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Jpa.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
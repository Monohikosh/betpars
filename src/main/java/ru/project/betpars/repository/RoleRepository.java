package ru.project.betpars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.betpars.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}

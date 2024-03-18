package ru.project.betpars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.project.betpars.model.User;

@Repository
public interface UserRepository extends GenericRepository<User> {

    User findByLogin(String login);


}

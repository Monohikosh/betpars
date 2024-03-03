package ru.project.betpars.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.betpars.model.Pars;

import java.util.List;

@Repository
public interface ParsRepository extends JpaRepository<Pars, Long> {

    List<Pars> findAllByStatus(String status);
    Page<Pars> findAllByStatusAndGameName(String status, String gameName, Pageable pageable);

}

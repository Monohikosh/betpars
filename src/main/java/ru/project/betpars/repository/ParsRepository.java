package ru.project.betpars.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.project.betpars.model.Pars;

import java.util.List;

@Repository
public interface ParsRepository extends JpaRepository<Pars, Long> {

    List<Pars> findAllByStatus(String status);

    @Query(nativeQuery = true, value = """
    select * from pars where pars.status = ?1 and pars.bk_name = ?2 and pars.game_name = ?3
  """)
    Page<Pars> findAllByStatusAndBkNameAndGameName(String status, String bkName, String gameName,
                                                    Pageable pageable);


}

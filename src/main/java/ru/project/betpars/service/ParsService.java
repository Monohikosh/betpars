package ru.project.betpars.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.project.betpars.model.Pars;
import ru.project.betpars.model.User;
import ru.project.betpars.repository.ParsRepository;

import java.util.List;

@Service
public class ParsService {

    private final ParsRepository repository;

    public ParsService(ParsRepository repository) {
        this.repository = repository;
    }

    public List<Pars> getAll() {
        return repository.findAll();
    }

    public Pars getOne(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Pars> getLiveCS(Pageable pageable) {
        return repository.findAllByStatusAndGameName("live", "Counter-Strike", pageable);
    }

    public Page<Pars> getLiveDota(Pageable pageable) {
        return repository.findAllByStatusAndGameName("live", "Dota 2", pageable);
    }

    public Page<Pars> getLiveValorant(Pageable pageable) {
        return repository.findAllByStatusAndGameName("live", "Valorant", pageable);
    }

    public Page<Pars> getLiveLol(Pageable pageable) {
        return repository.findAllByStatusAndGameName("live", "LoL", pageable);
    }

    public Page<Pars> getLineCS(Pageable pageable) {
        return repository.findAllByStatusAndGameName("line", "Counter-Strike", pageable);
    }

    public Page<Pars> getLineDota(Pageable pageable) {
        return repository.findAllByStatusAndGameName("line", "Dota2", pageable);
    }

    public Page<Pars> getLineValorant(Pageable pageable) {
        return repository.findAllByStatusAndGameName("line", "Valorant", pageable);
    }
    public Page<Pars> getLineLol(Pageable pageable) {
        return repository.findAllByStatusAndGameName("line", "LoL", pageable);
    }

}

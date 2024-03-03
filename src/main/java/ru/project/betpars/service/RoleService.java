package ru.project.betpars.service;


import org.springframework.stereotype.Service;
import ru.project.betpars.model.Role;
import ru.project.betpars.repository.RoleRepository;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository repository;

    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public List<Role> getList() {
        return repository.findAll();
    }

    public Role getOne(Long id) {
        return repository.findById(id).orElseThrow();
    }
}

package ru.project.betpars.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.project.betpars.model.User;
import ru.project.betpars.repository.UserRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final RoleService roleService;

    protected UserService(UserRepository repository, BCryptPasswordEncoder bCryptPasswordEncoder, RoleService roleService) {
        this.repository = repository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.roleService = roleService;
    }

    public Page<User> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public User getOne(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public User update(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void addSubscribe(Long userId) {
        User user = getOne(userId);
        user.setSubscribe(true);
        user.setStartSub(LocalDate.now());
        user.setEndSub(LocalDate.now().plusDays(30));
        user.setRole(roleService.getOne(2L));
        update(user);
    }

    public void removeSubscribe(Long userId) {
        User user = getOne(userId);
        user.setSubscribe(false);
        user.setStartSub(null);
        user.setEndSub(LocalDate.now());
        user.setRole(roleService.getOne(1L));
        update(user);
    }

    public Page<User> listAllPaginated(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public User create(User user) {
        if (repository.findByLogin(user.getLogin()) == null) {
            user.setRole(roleService.getOne(1L));
            user.setSubscribe(false);
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            return repository.save(user);
        }
        return null;
    }

    public User getByLogin(String login) {
        return repository.findByLogin(login);
    }


}
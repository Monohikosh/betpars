package ru.project.betpars.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.project.betpars.dto.UserDto;
import ru.project.betpars.mapper.UserMapper;
import ru.project.betpars.model.User;
import ru.project.betpars.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService service;
    private final UserMapper mapper;

    public UserController(UserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/profile/{id}")
    public String getProfile(@PathVariable Integer id, Model model) {
        model.addAttribute("user", mapper.toDto(service.getOne(Long.valueOf(id))));
//        return "profile/viewProfile";
        return "viewProfile";
    }

    @GetMapping("/list")
    public String getAllUsers(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "20") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "login"));
        Page<User> userPage = service.getAll(pageRequest);
        List<UserDto> userDtos = userPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("users", new PageImpl<>(userDtos));
//        return "/user/viewAllUsers";
        return "viewAllUsers";
    }


    @GetMapping("/profile/add-subscribe/{userId}")
    public String addSubscribeOnProfile(@PathVariable Long userId) {
        service.addSubscribe(userId);
        return "redirect:/users/profile/{userId}";
    }

    @GetMapping("/profile/remove-subscribe/{userId}")
    public String removeSubscribeOnProfile(@PathVariable Long userId) {
        service.removeSubscribe(userId);
        return "redirect:/users/profile/{userId}";
    }

    @GetMapping("/add-subscribe/{userId}")
    public String addSubscribe(@PathVariable Long userId) {
        service.addSubscribe(userId);
        return "redirect:/users/list";
    }

    @GetMapping("/remove-subscribe/{userId}")
    public String removeSubscribe(@PathVariable Long userId) {
        service.removeSubscribe(userId);
        return "redirect:/users/list";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") UserDto userDto) {
        service.create(mapper.toEntity(userDto));
        return "redirect:/login";
    }

    @GetMapping("/profile/delete-user/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        service.delete(userId);
        return "redirect:/users/list";
    }

}

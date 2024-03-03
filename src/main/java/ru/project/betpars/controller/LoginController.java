package ru.project.betpars.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.project.betpars.mapper.UserMapper;
import ru.project.betpars.service.UserService;

@Controller
public class LoginController {

    private final UserService userService;
    private final UserMapper userMapper;

    public LoginController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/login")
    public String login(HttpServletRequest httpServletRequest, Model model) {
        if (
                SecurityContextHolder.getContext().getAuthentication() != null &&
                        SecurityContextHolder.getContext().getAuthentication().isAuthenticated() &&
                        !(SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken)
        ) {
            return "redirect:/registration";
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logoutSystem(HttpServletRequest httpServletRequest) throws ServletException {
        httpServletRequest.logout();
        return "login";
    }
}
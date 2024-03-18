package ru.project.betpars.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError() {
        return "error";
    }

    @GetMapping("/error-with-message")
    public String handleError(@RequestParam(value = "message") String message, Model model) {
        model.addAttribute("message", message);
        return "error";
    }

}

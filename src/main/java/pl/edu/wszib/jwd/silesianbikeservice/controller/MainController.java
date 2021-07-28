package pl.edu.wszib.jwd.silesianbikeservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String get(Model model) {
        return "main";
    }
}
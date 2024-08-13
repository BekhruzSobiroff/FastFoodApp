package uz.pdp.fastfoodapp.controller;

import jakarta.persistence.Table;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {
@GetMapping
    public String profile(Model model) {

    return "profile";
}
}

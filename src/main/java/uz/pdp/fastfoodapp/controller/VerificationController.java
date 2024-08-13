package uz.pdp.fastfoodapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.pdp.fastfoodapp.dto.UserSignUpDto;
import uz.pdp.fastfoodapp.entity.User;
import uz.pdp.fastfoodapp.service.UserService;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/verify")
@RequiredArgsConstructor
public class VerificationController {
    private final UserService userService;
    @PostMapping
    public String verification(@RequestParam String num1, @RequestParam String num2, @RequestParam String num3,@RequestParam String num4) {
        String num=num1+num2+num3+num4;
        if (num.equals("1234")){
        userService.add(new User(readUserData()));
            return "login";}
        else return "verification";

    }
    public UserSignUpDto readUserData() {
        // Fayldan o'qish uchun to'g'ri yo'lni tanlang
        File file = new File("orbitor.json");

        // JSON obyekti yaratish uchun ObjectMapper dan foydalaning
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Fayldan o'qish
            return objectMapper.readValue(file, UserSignUpDto.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

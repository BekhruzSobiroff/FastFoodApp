package uz.pdp.fastfoodapp.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.pdp.fastfoodapp.dto.UserSignUpDto;
import uz.pdp.fastfoodapp.entity.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Controller
@RequestMapping("/signUp")
public class SignupController {
    @GetMapping
    public String signUpForGet() {
        return "signUp";
    }
    @PostMapping
    public String signUpForPost(@RequestParam String name, @RequestParam String email, @RequestParam String password, Model model) {
       doWriteToFile(new UserSignUpDto(name, email, password));
        model.addAttribute("email",email);
        return "verification";
    }
  static   void doWriteToFile(UserSignUpDto userSignUpDto){
      File file=new File("orbitor.json");
    ObjectMapper mapper = new ObjectMapper();
      try {
          mapper.writeValue(file, userSignUpDto);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }
}

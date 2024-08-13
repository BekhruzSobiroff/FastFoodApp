package uz.pdp.fastfoodapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.pdp.fastfoodapp.dto.UserLoginDto;
import uz.pdp.fastfoodapp.service.UserService;

@Controller
@RequestMapping("index")
@RequiredArgsConstructor
public class IndexController {
    private final UserService userService;

@GetMapping
    public String index(@RequestParam String email, @RequestParam String password){
        String result="";
        if(userService.isThereEmailAndPassword(new UserLoginDto(email,password))){
            return "index";
        }else {
            return "redirect:/login";
        }
    }
}

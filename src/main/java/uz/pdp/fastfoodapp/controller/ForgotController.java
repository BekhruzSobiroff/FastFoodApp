package uz.pdp.fastfoodapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.pdp.fastfoodapp.dto.UserLoginDto;
import uz.pdp.fastfoodapp.repo.UserRepository;
import uz.pdp.fastfoodapp.service.UserService;

@Controller
@RequestMapping("/forgot")
@RequiredArgsConstructor
public class ForgotController {
private final UserService userService;
    public static String Email;
    @GetMapping
    public String forgotForGet() {
    return "forgot";
}
@PostMapping
    public String forgotForPost(@RequestParam String email) {
   Email = email;
    return "verificationResend";

    }
@GetMapping("/recode")
    public String forgotForRecode(@RequestParam String num1, @RequestParam String num2, @RequestParam String num3, @RequestParam String num4) {
      String num=num1+num2+num3+num4;
      if (num.equals("1234"))return "recode";
      else return "recode";

}
@PostMapping("verificate")
    public String forgotForRecodePost(@RequestParam String password) {
    System.out.println(userService.updatePasswordWithEmail(new UserLoginDto(Email, password)));
    return "login";
}
}

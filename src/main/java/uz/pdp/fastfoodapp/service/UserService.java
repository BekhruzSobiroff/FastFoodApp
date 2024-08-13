package uz.pdp.fastfoodapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.fastfoodapp.dto.UserLoginDto;
import uz.pdp.fastfoodapp.entity.User;
import uz.pdp.fastfoodapp.repo.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
private final UserRepository userRepository;
public boolean isThereEmailAndPassword(UserLoginDto userLoginDto) {
    return userRepository.existsUserByEmailAndPassword(userLoginDto.email(), userLoginDto.password());
}
public boolean isThereEmail(String email) {
    return userRepository.existsUserByEmail(email);
}
public void add(User user){
  userRepository.save(user);
}
public int updatePasswordWithEmail(UserLoginDto userLoginDto) {
   return userRepository.updatePassword(userLoginDto.email(), userLoginDto.password());
}
}

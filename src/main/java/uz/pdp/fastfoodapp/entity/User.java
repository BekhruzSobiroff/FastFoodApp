package uz.pdp.fastfoodapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.fastfoodapp.dto.UserSignUpDto;
import uz.pdp.fastfoodapp.entity.enums.Role;

import java.io.File;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity()
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String name;
private String email;
private String password;
private Role role;
private String address;
private File img;
public User(UserSignUpDto userSignUpDto) {
    this.name= userSignUpDto.name();
    this.email= userSignUpDto.email();
    this.password= userSignUpDto.password();

}
}

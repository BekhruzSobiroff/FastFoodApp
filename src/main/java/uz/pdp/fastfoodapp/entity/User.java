package uz.pdp.fastfoodapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.fastfoodapp.dto.UserSignUpDto;

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
public User(UserSignUpDto userSignUpDto) {
    this.name= userSignUpDto.name();
    this.email= userSignUpDto.email();
    this.password= userSignUpDto.password();
}
}

package uz.pdp.fastfoodapp.dto;

import uz.pdp.fastfoodapp.entity.User;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
public record UserSignUpDto(String name, String email, String password) implements Serializable {

}
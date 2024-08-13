package uz.pdp.fastfoodapp.dto;

import uz.pdp.fastfoodapp.entity.User;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
public record UserLoginDto(String email, String password) implements Serializable {
}
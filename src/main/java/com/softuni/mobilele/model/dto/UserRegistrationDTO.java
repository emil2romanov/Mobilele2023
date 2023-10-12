package com.softuni.mobilele.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

//@FieldMatch(
//        first = "password",
//        second = "confirmPassword",
//        message = "Passwords should match."
//)
public record UserRegistrationDTO(@NotEmpty String firstName,
                                  @NotEmpty String lastName,
                                  @NotNull @Email String email,
                                  String password,
                                  String confirmPassword) {

}
package com.noobs.codecoach.service.dto.request;

import com.noobs.codecoach.domain.entity.Role;

public class CreateUserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role=Role.COACHEE.getRoleName();

    public String getRole() {
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public CreateUserDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CreateUserDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateUserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CreateUserDTO setPassword(String password) {
        this.password = password;
        return this;
    }
}

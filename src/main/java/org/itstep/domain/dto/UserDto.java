package org.itstep.domain.dto;

import lombok.*;
import org.hibernate.validator.constraints.Email;
import org.itstep.controller.validator.Age;
import org.itstep.controller.validator.Login;
import org.itstep.controller.validator.Password;
import org.itstep.domain.entity.User;

@Data
@NoArgsConstructor
public class UserDto {

    private int id;

    @Login(message = "{userDto.login}")
    @NonNull
    private String login;

    @NonNull
    @Password(message = "{userDto.password}")
    private String password;

    @Age(message = "{userDto.age}")
    private String age;

    private String phone;

    @Email
    private String email;

    public User toEntity() {
        return new User(id, login, password, Integer.parseInt(age), phone, email);
    }
}

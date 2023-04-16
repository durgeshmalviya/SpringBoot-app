package com.reg.registration;

import com.reg.registration.UserDto;
import com.reg.registration.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
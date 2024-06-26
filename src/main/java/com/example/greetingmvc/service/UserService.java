package com.example.greetingmvc.service;

import com.example.greetingmvc.models.Dto.UserDto;
import com.example.greetingmvc.models.User;

import java.util.List;


public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

    }


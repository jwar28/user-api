package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    public List<User> getUsers() {
        return userService.getUsers();
    }

    public User saveUser(User user) {
        return userService.saveUser(user);
    }

    public String deleteUserById(Long id) {
        Boolean ok = userService.deleteUserById(id);
        if (ok) {
            return "User succesfully deleted";
        }
        return "The user doesn't exist";
    }

    public User getUserById(Long id) {
        Optional<User> user = userService.getUserById(id);
        return user.orElse(null);
    }
}

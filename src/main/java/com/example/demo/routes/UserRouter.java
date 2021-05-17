package com.example.demo.routes;

import com.example.demo.controllers.UserController;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRouter {

    @Autowired
    UserController userController;

    @GetMapping
    public List<User> getUsers() {
        return userController.getUsers();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userController.saveUser(user);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userController.deleteUserById(id);
    }

    @GetMapping(path = "/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userController.getUserById(id);
    }
}

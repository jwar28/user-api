package com.example.demo.routes;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserRouter {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean deleteUserById(@PathVariable("id") Long id) {
        return userService.deleteUserById(id);
    }

    @GetMapping(path = "/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        Optional<User> user = userService.getUserById(id);
        return user.orElse(null);
    }
}

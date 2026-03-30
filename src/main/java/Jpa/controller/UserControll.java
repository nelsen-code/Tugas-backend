package Jpa.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import Jpa.model.User;
import Jpa.repository.UserRepo;

@RestController
@RequestMapping("/users")
public class UserControll {

    private final UserRepo userRepository;

    public UserControll(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
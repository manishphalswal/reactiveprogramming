package com.example.reactive.controller;

import com.example.reactive.entity.User;
import com.example.reactive.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping
    public Flux<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public Mono<User> getUserById(@PathVariable("userId") String userId) {
        return userRepository.findById(userId);
    }

    @PostMapping
    public Mono<User> saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/update")
    public Mono<User> updateUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/{userId}")
    public Mono<Void> deleteUser(@PathVariable("userId") String userId) {
        return userRepository.deleteById(userId);
    }
}

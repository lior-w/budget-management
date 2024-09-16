package com.budgetmanagement.controller;

import com.budgetmanagement.entity.User;
import com.budgetmanagement.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestParam String username,
                                               @RequestParam String email,
                                               @RequestParam String password,
                                               @RequestParam(required = false) String role) {
        try {
            User user = userService.registerUser(username, email, password, role);
            return ResponseEntity.ok("User registered successfully!");
        }
        catch (Exception e) {
            return ResponseEntity.status(400).body("Couldn't register user: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam String email, @RequestParam String password) {
        Optional<User> user = userService.findByEmail(email);
        if (user.isPresent() && userService.validatePassword(password, user.get().getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(400).body("Invalid credentials");
        }
    }
}

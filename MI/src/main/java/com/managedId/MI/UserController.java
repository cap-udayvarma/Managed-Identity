package com.managedId.MI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body("ID is not present");
        }

        User user = userRepository.findById(id).orElse(null);

        if (user == null) {
            return ResponseEntity.ok("User with ID " + id + " not found");
        }

        return ResponseEntity.ok(user);
    }
}

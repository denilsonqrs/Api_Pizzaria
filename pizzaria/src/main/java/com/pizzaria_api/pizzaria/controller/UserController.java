package com.pizzaria_api.pizzaria.controller;

import com.pizzaria_api.pizzaria.bussines.UserService;
import com.pizzaria_api.pizzaria.infrastructure.entitys.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> saveUser(@RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<User> getUser(@RequestParam String email){
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@RequestParam String email){
        userService.deleteUserByEmail(email);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity<Void> updateUser(@RequestParam Integer id, @RequestBody User user){
        userService.updateUserById(id, user);
        return ResponseEntity.ok().build();
    }
}

package com.demo.controller;

import com.demo.model.UserRecord;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/users/{userId}", produces = { "application/json", "application/xml" })
    public UserRecord getUserById(@PathVariable(name = "userId") Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping(value = "/users", produces = { "application/json", "application/xml" })
    public List<UserRecord> getAllUser() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/users", consumes = { "application/json", "application/xml" })
    public void addUser(@RequestBody UserRecord userRecord) {
        userService.addUser(userRecord);
    }

    @PatchMapping(value = "/users/{userId}", consumes = { "application/json", "application/xml" })
    public void updateUser(@PathVariable(name = "userId") Integer userId, @RequestBody UserRecord userRecord) {
        userService.updateUser(userId, userRecord);
    }

}

package com.itcourse.task2.controller;

import com.itcourse.task2.entity.User;
import com.itcourse.task2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User add(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public User deleteById(@PathVariable Long id){
        return userService.deleteUserById(id);
    }

    @GetMapping("/get-name")
    public String getName(Principal principal){
        return principal.getName();
    }
}

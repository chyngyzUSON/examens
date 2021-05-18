package com.itcourse.task2.controller;

import com.itcourse.task2.entity.User;
import com.itcourse.task2.model.AuthModel;
import com.itcourse.task2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/sign-up")
    public User save(@RequestBody User user) {
        return userService.saveWithPasswordEncode(user);
    }

    @PostMapping("/sign-in")
    public String getToken(@RequestBody AuthModel authModel){
        return userService.getTokenByAuthModel(authModel);
    }
}

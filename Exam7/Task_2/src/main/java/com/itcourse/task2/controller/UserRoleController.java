package com.itcourse.task2.controller;

import com.itcourse.task2.entity.UserRole;
import com.itcourse.task2.model.UserRoleModel;
import com.itcourse.task2.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping
    public UserRole save(@RequestBody UserRoleModel userRoleModel){
        return userRoleService.save(userRoleModel);
    }
}

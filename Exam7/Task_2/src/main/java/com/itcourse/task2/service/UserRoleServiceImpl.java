package com.itcourse.task2.service;

import com.itcourse.task2.entity.User;
import com.itcourse.task2.entity.UserRole;
import com.itcourse.task2.model.UserRoleModel;
import com.itcourse.task2.repository.UserRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepo userRoleRepo;
    @Autowired
    private UserService userService;

    @Override
    public UserRole save(UserRole userRole) {
        return userRoleRepo.save(userRole);
    }

    @Override
    public UserRole save(UserRoleModel userRoleModel) {
        UserRole userRole = new UserRole();
        userRole.setRoleName(userRoleModel.getRoleName());
        User user = userService.findById(userRoleModel.getId());

        if (user == null) throw new IllegalArgumentException("Студент с таким ID " + userRoleModel.getId() + " не найден");
        userRole.setUser(user);
        return userRoleRepo.save(userRole);
    }

    @Override
    public UserRole findById(Long id) {
        return userRoleRepo.findById(id).orElse(null);
    }
}

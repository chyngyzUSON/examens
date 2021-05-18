package com.itcourse.task2.service;

import com.itcourse.task2.entity.User;
import com.itcourse.task2.entity.UserRole;
import com.itcourse.task2.model.AuthModel;
import com.itcourse.task2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public User deleteUserById(Long id) {
        User user = findById(id);
        if (user != null){
            userRepo.delete(user);
            return user;
        }
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return userRepo.findByUsername(username).orElse(null);
    }

    @Override
    public User saveWithPasswordEncode(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user = userRepo.save(user);
        UserRole userRole = new UserRole();
        userRole.setRoleName("ROLE_USER");
        userRole.setUser(user);
        userRoleService.save(userRole);
        return user;
    }

    @Override
    public String getTokenByAuthModel(AuthModel authModel) {
        String authResult = "";
        User user = findByUsername(authModel.getUsername());
        if(user == null) authResult = "неверный логин/пароль";
        else {
            if (passwordEncoder.matches(authModel.getPassword(), user.getPassword())) {
                String loginPassPair = user.getUsername() + ":" + authModel.getPassword();
                authResult = "Basic " + Base64.getEncoder().encodeToString(loginPassPair.getBytes());
            } else authResult = "Неверный логин/пароль";
        }
        return authResult;
    }
}

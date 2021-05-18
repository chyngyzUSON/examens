package com.itcourse.task2.service;

import com.itcourse.task2.entity.User;
import com.itcourse.task2.model.AuthModel;

public interface UserService {
    User save(User user);
    User findById(Long id);
    User deleteUserById(Long id);
    User findByUsername(String username);

    User saveWithPasswordEncode(User user);
    String getTokenByAuthModel(AuthModel authModel);
}

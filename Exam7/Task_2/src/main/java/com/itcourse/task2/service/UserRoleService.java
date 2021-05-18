package com.itcourse.task2.service;

import com.itcourse.task2.entity.UserRole;
import com.itcourse.task2.model.UserRoleModel;

public interface UserRoleService {
    UserRole save(UserRole userRole);
    UserRole save(UserRoleModel userRoleModel);
    UserRole findById(Long id);

}

package com.dashboard.auth.service;

import com.dashboard.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

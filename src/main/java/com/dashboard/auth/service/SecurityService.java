package com.dashboard.auth.service;

public interface SecurityService {
    boolean isAuthenticated();

    void autoLogin(String username, String password);
}

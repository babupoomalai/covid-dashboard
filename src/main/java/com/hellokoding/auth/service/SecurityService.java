package com.hellokoding.auth.service;

public interface SecurityService {
    boolean isAuthenticated();

    void autoLogin(String username, String password);
}

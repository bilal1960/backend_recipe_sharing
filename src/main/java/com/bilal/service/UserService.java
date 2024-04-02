package com.bilal.service;

import com.bilal.model.User;

public interface UserService {

    public User findUserById(Long userId) throws Exception;

    public User findUserByJwt(String jwt) throws  Exception;
}

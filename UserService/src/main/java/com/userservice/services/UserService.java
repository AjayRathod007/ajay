package com.userservice.services;

import com.userservice.entities.User;

import java.util.List;

public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    //getAllUser
    List<User> getAllUser();

    //get single user of given userId

    User getUser(String userId);
}

package com.devhub.userlogin.userlogin.service;


import com.devhub.userlogin.userlogin.model.User;

import java.util.List;
import java.util.Set;


public interface UserService {

    Set<User> returnAListOfAllUsers();

    List<User> findOneUserById(Long userId);
}

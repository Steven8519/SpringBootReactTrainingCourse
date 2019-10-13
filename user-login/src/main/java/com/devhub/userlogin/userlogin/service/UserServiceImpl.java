package com.devhub.userlogin.userlogin.service;


import com.devhub.userlogin.userlogin.model.User;
import com.devhub.userlogin.userlogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> returnAListOfAllUsers() {
        Set<User> users = new HashSet<>();
        userRepository.findAll().forEach(users::add);
        return  users;
    }

    @Override
    public List<User> findOneUserById(Long userId) {
        return userRepository.findAllById(Collections.singleton(userId));
    }


}

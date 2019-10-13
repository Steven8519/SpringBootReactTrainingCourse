package com.devhub.userlogin.userlogin.repository;

import com.devhub.userlogin.userlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

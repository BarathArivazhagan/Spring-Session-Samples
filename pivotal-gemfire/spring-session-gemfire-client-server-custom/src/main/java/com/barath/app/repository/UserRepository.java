package com.barath.app.repository;

import com.barath.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    User findByUserEmailId(String emailId);

}

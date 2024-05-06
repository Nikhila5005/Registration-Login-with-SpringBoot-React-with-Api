package com.api.apifb.repositories;

import com.api.apifb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

    User findByResetToken(String resetToken); // If not already added



}

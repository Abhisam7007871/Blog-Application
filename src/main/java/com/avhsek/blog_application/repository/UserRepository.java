package com.avhsek.blog_application.repository;

import com.avhsek.blog_application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);


}

package com.ecom.backend.repository;


import com.ecom.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Purpose: provides DB queries without writing SQL.
public interface UserRepository extends JpaRepository<User, Long> {
     Optional<User> findByEmail(String email);

}

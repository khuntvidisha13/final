package com.homeease.homeease.repository;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.homeease.homeease.model.User;
import com.homeease.homeease.model.Role;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByVerificationToken(String token);
    List<User> findByRole(Role role);
    long countByRole(Role role);
    long countByEnabled(boolean enabled);
}

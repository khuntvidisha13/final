package com.homeease.homeease.repository;

import com.homeease.homeease.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    Optional<Worker> findByEmail(String email);
    Optional<Worker> findByVerificationToken(String token);

    List<Worker> findByApprovedFalse();
    List<Worker> findByApprovedTrue();
    
    long countByApprovedTrue();
    long countByApprovedFalse();
    long countByEnabled(boolean enabled);
}

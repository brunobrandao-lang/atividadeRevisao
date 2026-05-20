package com.example.atvdNv190526.repository;

import com.example.atvdNv190526.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
    Optional<ClienteModel> findByEmail(String email);
}

package com.example.atvdNv190526.repository;

import com.example.atvdNv190526.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {
    Optional<EnderecoModel>findByCep(String cep);
}

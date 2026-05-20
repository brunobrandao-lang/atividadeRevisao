package com.example.atvdNv190526.controller;

import com.example.atvdNv190526.dtos.FuncionarioRequestDTO;
import com.example.atvdNv190526.dtos.FuncionarioResponseDTO;
import com.example.atvdNv190526.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody FuncionarioRequestDTO dto){
        service.salvarFuncionario(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Funcionario cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable Long id, @RequestBody @Valid FuncionarioRequestDTO dto){
        service.atualizar(id, dto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem", "Funcionario atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable Long id){
            service.excluir(id);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(Map.of("mensagem", "Funcionario excluido com sucesso"));
    }
}

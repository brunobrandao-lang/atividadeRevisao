package com.example.atvdNv190526.service;

import com.example.atvdNv190526.dtos.FuncionarioRequestDTO;
import com.example.atvdNv190526.dtos.FuncionarioResponseDTO;
import com.example.atvdNv190526.model.FuncionarioModel;
import com.example.atvdNv190526.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(funcionario -> new FuncionarioResponseDTO(
                        funcionario.getNomeFuncionario(),
                        funcionario.getEmail()))
                .toList();
    }

    public FuncionarioModel salvarFuncionario(FuncionarioRequestDTO dto){
        if (repository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário ja existente");
        }

        FuncionarioModel novoFuncionario = new FuncionarioModel();
        novoFuncionario.setNomeFuncionario(dto.getNomeFuncionario());
        novoFuncionario.setEmail(dto.getEmail());

        return repository.save(novoFuncionario);
    }

    public void atualizar(Long id, FuncionarioRequestDTO dto){
        FuncionarioModel funcionario = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Funcionario não encontrado"));

        funcionario.setNomeFuncionario(dto.getNomeFuncionario());
        funcionario.setMatricula(dto.getMatricula());
        funcionario.setDataNascimento(dto.getDataNascimento());
        funcionario.setSalario(dto.getSalario());
        funcionario.setEmail(dto.getEmail());
        funcionario.setEndereco(dto.getEndereco());

        repository.save(funcionario);
    }

    public void excluir(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Funcionario não encontrado");
        }
        repository.deleteById(id);
    }
}


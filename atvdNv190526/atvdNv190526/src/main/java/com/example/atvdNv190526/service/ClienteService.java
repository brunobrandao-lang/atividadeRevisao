package com.example.atvdNv190526.service;

import com.example.atvdNv190526.dtos.ClienteRequestDTO;
import com.example.atvdNv190526.dtos.ClienteResponseDTO;
import com.example.atvdNv190526.model.ClienteModel;
import com.example.atvdNv190526.repository.ClienteRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(Cliente-> new ClienteResponseDTO(
                        Cliente.getNomeCliente(),
                        Cliente.getEmail()))
                .toList();
    }

    public ClienteModel salvarCliente(ClienteRequestDTO dto){
        if (repository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Cliente ja existente");
        }

        ClienteModel novoCliente = new ClienteModel();
        novoCliente.setNomeCliente(dto.getNomeCliente());
        novoCliente.setEmail(dto.getEmail());

        return repository.save(novoCliente);

    }

    public void atualizar(Long id, ClienteRequestDTO dto){
        ClienteModel cliente = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cliente não encontrado"));

        cliente.setNomeCliente(dto.getNomeCliente());
        cliente.setEmail(dto.getEmail());
        cliente.setEndereco(dto.getEndereco());

        repository.save(cliente);
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Cliente não encontrado");
        }
        repository.deleteById(id);
    }
}

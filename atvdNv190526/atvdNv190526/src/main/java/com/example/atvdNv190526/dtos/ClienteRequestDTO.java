package com.example.atvdNv190526.dtos;

import com.example.atvdNv190526.model.EnderecoModel;
import jakarta.validation.constraints.NotBlank;

public class ClienteRequestDTO {
    @NotBlank(message = "Informe seu nome:")
    private String nomeCliente;

    @NotBlank(message = "Informe seu email:")
    private String email;

    @NotBlank(message = "Informe seu email:")
    private String endereco;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nomeCliente, String email, String endereco) {
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "Informe seu nome:") String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(@NotBlank(message = "Informe seu nome:") String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public @NotBlank(message = "Informe seu email:") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Informe seu email:") String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotBlank(message = "Informe seu email:") String endereco) {
        this.endereco = endereco;
    }
}

package com.example.atvdNv190526.dtos;

public class ClienteResponseDTO {
    private String nomeCliente;
    private String email;

    public ClienteResponseDTO() {
    }

    public ClienteResponseDTO(String nomeCliente, String email) {
        this.nomeCliente = nomeCliente;
        this.email = email;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

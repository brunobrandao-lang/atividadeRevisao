package com.example.atvdNv190526.dtos;

public class FuncionarioResponseDTO {
    private String nomeFuncionario;
    private String email;

    public FuncionarioResponseDTO() {
    }

    public FuncionarioResponseDTO(String nomeFuncionario, String email) {
        this.nomeFuncionario = nomeFuncionario;
        this.email = email;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

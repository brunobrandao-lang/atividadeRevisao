package com.example.atvdNv190526.dtos;

import com.example.atvdNv190526.model.EnderecoModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FuncionarioRequestDTO {
    @NotBlank(message = "Informe seu nome:")
    private String nomeFuncionario;

    @NotBlank(message = "Informe sua matrícula:")
    private String matricula;

    @NotBlank(message = "Informe sua data de nascimento:")
    private String dataNascimento;

    @NotNull(message = "Informe seu salario:")
    private Double salario;

    @NotBlank(message = "informe seu email:")
    private String email;

    @NotBlank(message = "Informe seu endereço:")
    private String endereco;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nomeFuncionario, String matricula, String dataNascimento, Double salario, String email, String endereco) {
        this.nomeFuncionario = nomeFuncionario;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "Informe seu nome:") String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(@NotBlank(message = "Informe seu nome:") String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public @NotBlank(message = "Informe sua matrícula:") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "Informe sua matrícula:") String matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "Informe sua data de nascimento:") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "Informe sua data de nascimento:") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull(message = "Informe seu salario:") Double getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "Informe seu salario:") Double salario) {
        this.salario = salario;
    }

    public @NotBlank(message = "informe seu email:") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "informe seu email:") String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotBlank(message = "Informe seu endereço:") String endereco) {
        this.endereco = endereco;
    }
}

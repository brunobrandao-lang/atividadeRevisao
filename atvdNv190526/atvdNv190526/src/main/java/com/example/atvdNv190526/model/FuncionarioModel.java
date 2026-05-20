package com.example.atvdNv190526.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_funcionario")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeFuncionario;

    @Column(nullable = false, unique = true)
    private String matricula;

    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private Double salario;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private EnderecoModel endereco;

    public FuncionarioModel() {
    }

    public FuncionarioModel(Long id, String nomeFuncionario, String matricula, String dataNascimento, Double salario, String email, EnderecoModel endereco) {
        this.id = id;
        this.nomeFuncionario = nomeFuncionario;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }
}

package com.example.atvdNv190526.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_Cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeCliente;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private EnderecoModel endereco;

    public ClienteModel() {
    }

    public ClienteModel(Long id, String nomeCliente, String email, EnderecoModel endereco) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }
}

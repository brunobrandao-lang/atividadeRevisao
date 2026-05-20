package com.example.atvdNv190526.enums;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    private String nome;
    private String sigla;

    UnidadeFederativa() {
    }

    UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}

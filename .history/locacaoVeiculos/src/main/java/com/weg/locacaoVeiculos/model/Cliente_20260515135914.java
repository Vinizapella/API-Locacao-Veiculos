package com.weg.locacaoVeiculos.model;

public class Cliente {

    private int id;

    private String nome;
    
    private String cnh;

    private String email;

    public Cliente(String nome, String cnh, String email) {
        this.nome = nome;
        this.cnh = cnh;
        this.email = email;
    }

    public Cliente(int id, String nome, String cnh, String email) {
        this.id = id;
        this.nome = nome;
        this.cnh = cnh;
        this.email = email;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    


}

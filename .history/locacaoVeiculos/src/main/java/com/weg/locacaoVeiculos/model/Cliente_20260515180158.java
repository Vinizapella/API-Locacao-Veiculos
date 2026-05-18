package com.weg.locacaoVeiculos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String cnh;

    @Column(nullable = false, unique = true)
    private String email;

    // Construtor completo com ID
    public Cliente(Long id, String nome, String cnh, String email) {
        this.id = id;
        this.nome = nome;
        this.cnh = cnh;
        this.email = email;
    }

    // Construtor sem ID (ideal para novos registros)
    public Cliente(String nome, String cnh, String email) {
        this.nome = nome;
        this.cnh = cnh;
        this.email = email;
    }

    // Construtor vazio (obrigatório para o JPA)
    public Cliente() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

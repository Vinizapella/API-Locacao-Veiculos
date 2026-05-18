package com.weg.locacaoVeiculos.model;

import java.math.BigDecimal;

public class Veiculo {
    
    private Long id;

    private String marca;

    private String modelo;

    private String placa;

    private BigDecimal valorDiaria;

    private Boolean disponivel;

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public Veiculo(Long id, String marca, String modelo, String placa, BigDecimal valorDiaria, Boolean disponivel) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }

    public Veiculo(String marca, String modelo, String placa, BigDecimal valorDiaria, Boolean disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }

    

    public Veiculo(){

    }


}

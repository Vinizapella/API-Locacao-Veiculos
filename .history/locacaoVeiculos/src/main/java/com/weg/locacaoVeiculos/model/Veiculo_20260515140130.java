package com.weg.locacaoVeiculos.model;

import java.math.BigDecimal;

public class Veiculo {
    
    private int id;

    private String marca;

    private String modelo;

    private String placa;

    private BigDecimal valorDiaria;

    private Boolean disponivel;

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    

    

}

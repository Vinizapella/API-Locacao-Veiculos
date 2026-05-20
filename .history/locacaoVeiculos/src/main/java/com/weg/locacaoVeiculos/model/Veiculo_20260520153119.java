package com.weg.locacaoVeiculos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@
@Table(name = "veiculo")
@Getter
@Setter
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;

    private String modelo;

    private String placa;

    private BigDecimal valorDiaria;

    private Boolean disponivel = true;



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

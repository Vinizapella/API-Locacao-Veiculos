package com.weg.locacaoVeiculos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "locacao")
@Getter
@Setter
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer dias;

    private BigDecimal valorTotal;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    public Locacao(Long id, Integer dias, BigDecimal valorTotal, Cliente cliente, Veiculo veiculo) {
        this.id = id;
        this.dias = dias;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public Locacao(Integer dias, BigDecimal valorTotal, Cliente cliente, Veiculo veiculo) {
        this.dias = dias;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public Locacao(Integer dias, Cliente cliente, Veiculo veiculo) {
        this.dias = dias;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public Locacao() {
    }


}


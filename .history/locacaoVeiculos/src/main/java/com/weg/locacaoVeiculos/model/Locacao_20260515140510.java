package com.weg.locacaoVeiculos.model;

public class Locacao {

    private Long id;

    private Interger dias;

    private BigDecimal valorTotal;
    
}


// id: Long (Chave Primária)
● dias: Integer (Quantidade de dias da locação)
● valorTotal: BigDecimal (Calculado pelo sistema)
● cliente: Cliente (Relacionamento)
● veiculo: Veiculo (Relacionamento)
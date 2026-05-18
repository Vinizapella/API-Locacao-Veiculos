package com.weg.locacaoVeiculos.dto.locacao;

import java.math.BigDecimal;

public record LocacaoResponseDTO (
        Long id,
        Integer dias,
        BigDecimal valorTotal,
        String clienteNome,
        String modeloVeiculo
){
}

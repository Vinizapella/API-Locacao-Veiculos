package com.weg.locacaoVeiculos.dto.locacao;

public record LocacaoCreateDTO(
        Integer dias,
        Long clienteId,
        Long veiculoId
) {
}

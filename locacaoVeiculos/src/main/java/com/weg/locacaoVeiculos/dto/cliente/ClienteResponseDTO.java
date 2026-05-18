package com.weg.locacaoVeiculos.dto.cliente;

public record ClienteResponseDTO(
        Long id,
        String nome,
        String cnh,
        String email
) {
}

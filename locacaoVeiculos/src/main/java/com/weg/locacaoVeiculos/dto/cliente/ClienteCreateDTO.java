package com.weg.locacaoVeiculos.dto.cliente;

public record ClienteCreateDTO(
        String nome,
        String cnh,
        String email
) {
}

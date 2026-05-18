package com.weg.locacaoVeiculos.mapper;

import com.weg.locacaoVeiculos.dto.cliente.ClienteCreateDTO;
import com.weg.locacaoVeiculos.dto.cliente.ClienteResponseDTO;
import com.weg.locacaoVeiculos.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper{

    public Cliente toEntity(
        ClienteCreateDTO clienteCreateDTO
    ){
        return new Cliente(
                clienteCreateDTO.nome(),
                clienteCreateDTO.cnh(),
                clienteCreateDTO.email()
        );
    }

    public ClienteResponseDTO clienteResponseDTO(
            Cliente cliente
    ){
        return new ClienteResponseDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getCnh(),
                cliente.getEmail()
        );
    }
}

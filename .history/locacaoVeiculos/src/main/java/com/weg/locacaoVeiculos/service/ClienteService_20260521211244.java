package com.weg.locacaoVeiculos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weg.locacaoVeiculos.dto.MensagemDTO;
import com.weg.locacaoVeiculos.dto.cliente.ClienteCreateDTO;
import com.weg.locacaoVeiculos.dto.cliente.ClienteResponseDTO;
import com.weg.locacaoVeiculos.dto.cliente.ClienteUpdateDTO;
import com.weg.locacaoVeiculos.mapper.ClienteMapper;
import com.weg.locacaoVeiculos.model.Cliente;
import com.weg.locacaoVeiculos.projection.ClienteGastoProjection;
import com.weg.locacaoVeiculos.repositorio.ClienteRepositorio;

@Service
public class ClienteService {

    private ClienteMapper clienteMapper;

    private ClienteRepositorio clienteRepositorio;

    public ClienteService(
            ClienteMapper clienteMapper,
            ClienteRepositorio clienteRepositorio
    ){
        this.clienteMapper = clienteMapper;
        this.clienteRepositorio = clienteRepositorio;
    }

    public ClienteResponseDTO criaCliente(
            ClienteCreateDTO clienteCreateDTO
    ){
        Cliente cliente = clienteMapper.toEntity(clienteCreateDTO);

        clienteRepositorio.save(cliente);

        return clienteMapper.clienteResponseDTO(cliente);
    }

    public List<ClienteResponseDTO> listarClientes(){
        return clienteRepositorio.findAll()
                .stream()
                .map(clienteMapper::clienteResponseDTO)
                .toList();
    }

    public ClienteResponseDTO buscarPorId(
            Long id
    ){
        Cliente cliente = clienteRepositorio.findById(id)
                .orElseThrow(()->new RuntimeException("Id não encontrado"));
        return clienteMapper.clienteResponseDTO(cliente);
    }

    public ClienteResponseDTO atualizar(
            ClienteUpdateDTO clienteUpdateDTO,
            Long id
    ){
        Cliente cliente = clienteRepositorio.findById(id)
                .orElseThrow(()->new RuntimeException("Id não encontrado"));

        cliente.setNome(clienteUpdateDTO.nome());
        cliente.setEmail(clienteUpdateDTO.email());
        Cliente cliente1 = clienteRepositorio.save(cliente);
        return clienteMapper.clienteResponseDTO(cliente1);
    }

    public MensagemDTO deletar(
            Long id
    ){
        if (!clienteRepositorio.existsById(id)){
               throw new RuntimeException("Id não encontrado");
        }
            clienteRepositorio.deleteById(id);
        return new MensagemDTO("Cliente removido com sucesso!");
    }

    public List<ClienteGastoProjection> relatorioGastosClientes() {
        return clienteRepositorio.obterRelatorioGastos();
    }

}



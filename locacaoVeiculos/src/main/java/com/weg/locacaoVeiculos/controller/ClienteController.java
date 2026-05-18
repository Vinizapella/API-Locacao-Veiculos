package com.weg.locacaoVeiculos.controller;

import com.weg.locacaoVeiculos.dto.MensagemDTO;
import com.weg.locacaoVeiculos.dto.cliente.ClienteCreateDTO;
import com.weg.locacaoVeiculos.dto.cliente.ClienteResponseDTO;
import com.weg.locacaoVeiculos.dto.cliente.ClienteUpdateDTO;
import com.weg.locacaoVeiculos.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(
            ClienteService clienteService
    ) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> criarCliente(
            @RequestBody
            ClienteCreateDTO clienteCreateDTO
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(clienteService.criaCliente(clienteCreateDTO));
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listarCLientes(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.listarClientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> buscaClientePorId(
            @PathVariable
            Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body((clienteService.buscarPorId(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> atualizaCliente(
            @RequestBody
            ClienteUpdateDTO clienteUpdateDTO,
            @PathVariable
            Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.atualizar(clienteUpdateDTO, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MensagemDTO> deletarCliente(
            @PathVariable
            Long id
    ){
        return ResponseEntity.status((HttpStatus.OK))
                .body(clienteService.deletar(id));
    }

}

package com.weg.locacaoVeiculos.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.locacaoVeiculos.dto.MensagemDTO;
import com.weg.locacaoVeiculos.dto.locacao.LocacaoCreateDTO;
import com.weg.locacaoVeiculos.dto.locacao.LocacaoResponseDTO;
import com.weg.locacaoVeiculos.mapper.LocacaoMapping;
import com.weg.locacaoVeiculos.service.LocacaoService;



@RestController
@RequestMapping("/locacoes")
public class LocacaoController {

    private final LocacaoMapping locacaoMapping;

    private final LocacaoService locacaoService;

    public LocacaoController(
        LocacaoMapping locacaoMapping, 
        LocacaoService locacaoService
    ) {
        this.locacaoMapping = locacaoMapping;
        this.locacaoService = locacaoService;
    }
    
    @PostMapping
    public ResponseEntity<LocacaoResponseDTO> ciarLocacao(
        @RequestBody
        LocacaoCreateDTO locacaoCreateDTO
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(locacaoService.criarLocacao(locacaoCreateDTO));
    }

    @GetMapping
    public ResponseEntity<List<LocacaoResponseDTO>> listarLoacoes(){
        return ResponseEntity.status(HttpStatus.OK)
        .body(locacaoService.listarLocacoes());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MensagemDTO> deletarLocacao(
        @PathVariable
        Long id
    ){
        return ResponseEntity.status(HttpStatus.)
    }

}

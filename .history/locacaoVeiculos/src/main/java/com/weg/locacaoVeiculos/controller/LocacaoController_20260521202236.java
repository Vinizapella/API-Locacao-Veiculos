package com.weg.locacaoVeiculos.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.weg.locacaoVeiculos.dto.locacao.LocacaoCreateDTO;
import com.weg.locacaoVeiculos.dto.locacao.LocacaoResponseDTO;
import com.weg.locacaoVeiculos.mapper.LocacaoMapping;
import com.weg.locacaoVeiculos.service.LocacaoService;

import ch.qos.logback.core.joran.spi.HttpUtil;

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
    
    public ResponseEntity<LocacaoResponseDTO> ciarLocacao(
        LocacaoCreateDTO locacaoCreateDTO
    ){
        return ResponseEntity.status(HttpStatusCode.valueOf(code).CREATED)
            .body(locacaoService.)
    }

    

}

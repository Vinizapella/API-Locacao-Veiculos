package com.weg.locacaoVeiculos.controller;

import org.springframework.http.ResponseEntity;

import com.weg.locacaoVeiculos.mapper.LocacaoMapping;
import com.weg.locacaoVeiculos.service.LocacaoService;

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
    
    public ResponseEntity

    

}

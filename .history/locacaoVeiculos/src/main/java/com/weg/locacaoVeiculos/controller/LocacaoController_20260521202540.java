package com.weg.locacaoVeiculos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.locacaoVeiculos.dto.locacao.LocacaoCreateDTO;
import com.weg.locacaoVeiculos.dto.locacao.LocacaoResponseDTO;
import com.weg.locacaoVeiculos.mapper.LocacaoMapping;
import com.weg.locacaoVeiculos.service.LocacaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("path", method=RequestMethod.GET)
public String requestMethodName(@RequestParam String param) {
    return new String();
}

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
        @Pa
        LocacaoCreateDTO locacaoCreateDTO
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(locacaoService.criarLocacao(locacaoCreateDTO));
    }

    public Response

}

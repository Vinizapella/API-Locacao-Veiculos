package com.weg.locacaoVeiculos.controller;

import com.weg.locacaoVeiculos.dto.MensagemDTO;
import com.weg.locacaoVeiculos.dto.veiculo.VeiculoCreateDTO;
import com.weg.locacaoVeiculos.dto.veiculo.VeiculoResponseDTO;
import com.weg.locacaoVeiculos.dto.veiculo.VeiculoUpdateDTO;
import com.weg.locacaoVeiculos.mapper.VeiculoMapper;
import com.weg.locacaoVeiculos.service.VeiculoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

import java.util.List;

import org.apache.catalina.connector.Response;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoMapper veiculoMapper;

    private final VeiculoService veiculoService;

    public VeiculoController(
            VeiculoMapper veiculoMapper,
            VeiculoService veiculoService
    ) {
        this.veiculoMapper = veiculoMapper;
        this.veiculoService = veiculoService;
    }

    @PostMapping
    public ResponseEntity<VeiculoResponseDTO> criaVeiculo(
            @RequestBody
            VeiculoCreateDTO veiculoCreateDTO
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(veiculoService.criarVeiculo(veiculoCreateDTO));
    }

    @GetMapping
    public ResponseEntity<List<VeiculoResponseDTO>>listarVeiculos(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(veiculoService.listarVeiculos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoResponseDTO> procurarVeiculoPorId(
            @PathVariable
            Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(veiculoService.procurarId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VeiculoResponseDTO> atualizarVeiculo(
            @RequestBody
            VeiculoUpdateDTO veiculoUpdateDTO,
            @PathVariable
            Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(veiculoService.atualizarVeiculo(veiculoUpdateDTO, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MensagemDTO> deletarVeiculo(
            @PathVariable
            Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(veiculoService.deletarVeiculo(id));
    }

    @GetMapping("/disponivel")
    public ResponseEntity<List<VeiculoResponseDTO>>listarVeiculosDisponiveis(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(ve)   
    }
}

package com.weg.locacaoVeiculos.service;

import com.weg.locacaoVeiculos.dto.MensagemDTO;
import com.weg.locacaoVeiculos.dto.veiculo.VeiculoCreateDTO;
import com.weg.locacaoVeiculos.dto.veiculo.VeiculoResponseDTO;
import com.weg.locacaoVeiculos.dto.veiculo.VeiculoUpdateDTO;
import com.weg.locacaoVeiculos.mapper.VeiculoMapper;
import com.weg.locacaoVeiculos.model.Cliente;
import com.weg.locacaoVeiculos.model.Veiculo;
import com.weg.locacaoVeiculos.repositorio.VeiculoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepositorio veiculoRepositorio;

    private final VeiculoMapper veiculoMapper;

    public VeiculoService(
            VeiculoRepositorio veiculoRepositorio,
            VeiculoMapper veiculoMapper
    ) {
        this.veiculoRepositorio = veiculoRepositorio;
        this.veiculoMapper = veiculoMapper;
    }

    public VeiculoResponseDTO criarVeiculo(
            VeiculoCreateDTO veiculoCreateDTO
    ){
        Veiculo veiculo = veiculoMapper.toEntity(veiculoCreateDTO);
        veiculoRepositorio.save(veiculo);
        return veiculoMapper.toResponse(veiculo);
    }

    public List<VeiculoResponseDTO> listarVeiculos(){
        return veiculoRepositorio.findAll()
                .stream()
                .map(veiculoMapper::toResponse)
                .toList();
    }

    public VeiculoResponseDTO procurarId(
            Long id
    ){
        Veiculo veiculo = veiculoRepositorio.findById(id)
                .orElseThrow(()->new RuntimeException("Não existe veiculo com este ID"));
        return veiculoMapper.toResponse(veiculo);
    }

    public VeiculoResponseDTO atualizarVeiculo(
            VeiculoUpdateDTO veiculoUpdateDTO,
            Long id
    ){
        Veiculo veiculo = veiculoRepositorio.findById(id)
                .orElseThrow(()-> new RuntimeException("Não existe veiculo com este ID"));

        veiculo.setValorDiaria(veiculoUpdateDTO.valorDiaria());

        Veiculo veiculo1 = veiculoRepositorio.save(veiculo);

        return veiculoMapper.toResponse(veiculo1);
    }

    public MensagemDTO deletarVeiculo(
            Long id
    ){
        Veiculo veiculo = veiculoRepositorio.findById(id)
                .orElseThrow(()-> new RuntimeException("Não existe veiculo com este ID"));

        veiculoRepositorio.deleteById(id);

        return new MensagemDTO("Veiculo removido com sucesso!");
    }

    public List<VeiculoResponseDTO> listarVeiculosDisponiveis(){
        return veiculoRepositorio.findByDisponivel(true)
                        .stream()
                        .map(mapper)
    }
}

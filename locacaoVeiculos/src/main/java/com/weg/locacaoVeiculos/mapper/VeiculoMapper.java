package com.weg.locacaoVeiculos.mapper;

import com.weg.locacaoVeiculos.dto.veiculo.VeiculoCreateDTO;
import com.weg.locacaoVeiculos.dto.veiculo.VeiculoResponseDTO;
import com.weg.locacaoVeiculos.model.Veiculo;
import org.springframework.stereotype.Component;

@Component
public class VeiculoMapper {

    public Veiculo toEntity(
            VeiculoCreateDTO veiculoCreateDTO
    ){
        return new Veiculo(
                veiculoCreateDTO.marca(),
                veiculoCreateDTO.modelo(),
                veiculoCreateDTO.placa(),
                veiculoCreateDTO.valorDiaria(),
                true
        );
    }

    public VeiculoResponseDTO toResponse(
            Veiculo veiculo
    ){
        return new VeiculoResponseDTO(
               veiculo.getId(),
                veiculo.getMarca(),
                veiculo.getModelo(),
                veiculo.getPlaca(),
                veiculo.getValorDiaria(),
                veiculo.getDisponivel()
        );
    }

}

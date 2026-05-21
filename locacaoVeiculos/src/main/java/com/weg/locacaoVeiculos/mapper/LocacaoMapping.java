package com.weg.locacaoVeiculos.mapper;

import com.weg.locacaoVeiculos.dto.locacao.LocacaoCreateDTO;
import com.weg.locacaoVeiculos.dto.locacao.LocacaoResponseDTO;
import com.weg.locacaoVeiculos.model.Cliente;
import com.weg.locacaoVeiculos.model.Locacao;
import com.weg.locacaoVeiculos.model.Veiculo;

public class LocacaoMapping {

    public LocacaoResponseDTO locacaoResponseDTO(
            Locacao locacao
    ){
        return new LocacaoResponseDTO(
                locacao.getId(),
                locacao.getDias(),
                locacao.getValorTotal(),
                locacao.getCliente().getNome(),
                locacao.getVeiculo().getModelo()
        );
    }

}

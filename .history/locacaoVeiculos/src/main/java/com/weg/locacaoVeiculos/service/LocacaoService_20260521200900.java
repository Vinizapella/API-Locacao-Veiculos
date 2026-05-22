package com.weg.locacaoVeiculos.service;

import com.weg.locacaoVeiculos.dto.MensagemDTO;
import com.weg.locacaoVeiculos.dto.locacao.LocacaoCreateDTO;
import com.weg.locacaoVeiculos.dto.locacao.LocacaoResponseDTO;
import com.weg.locacaoVeiculos.mapper.ClienteMapper;
import com.weg.locacaoVeiculos.mapper.LocacaoMapping;
import com.weg.locacaoVeiculos.mapper.VeiculoMapper;
import com.weg.locacaoVeiculos.model.Cliente;
import com.weg.locacaoVeiculos.model.Locacao;
import com.weg.locacaoVeiculos.model.Veiculo;
import com.weg.locacaoVeiculos.repositorio.ClienteRepositorio;
import com.weg.locacaoVeiculos.repositorio.LocacaoRepositorio;
import com.weg.locacaoVeiculos.repositorio.VeiculoRepositorio;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class LocacaoService {

    private final LocacaoMapping locacaoMapping;

    private final LocacaoRepositorio locacaoRepositorio;

    private final ClienteRepositorio clienteRepositorio;

    private final ClienteMapper clienteMapper;

    private final VeiculoRepositorio veiculoRepositorio;

    private final VeiculoMapper veiculoMapper;

    public LocacaoService(LocacaoMapping locacaoMapping,
                          LocacaoRepositorio locacaoRepositorio,
                          ClienteRepositorio clienteRepositorio,
                          ClienteMapper clienteMapper,
                          VeiculoRepositorio veiculoRepositorio,
                          VeiculoMapper veiculoMapper)
    {
        this.locacaoMapping = locacaoMapping;
        this.locacaoRepositorio = locacaoRepositorio;
        this.clienteRepositorio = clienteRepositorio;
        this.clienteMapper = clienteMapper;
        this.veiculoRepositorio = veiculoRepositorio;
        this.veiculoMapper = veiculoMapper;
    }

    public LocacaoResponseDTO locacaoResponseDTO(
            LocacaoCreateDTO locacaoCreateDTO
    ){
        Cliente cliente = clienteRepositorio.findById(locacaoCreateDTO.clienteId())
                .orElseThrow(()->new RuntimeException("Cliente não encontrado com esse ID"));

        Veiculo veiculo = veiculoRepositorio.findById(locacaoCreateDTO.veiculoId())
                .orElseThrow(()->new RuntimeException("Veiculo não encontrado com este ID"));

        BigDecimal dias = BigDecimal.valueOf(locacaoCreateDTO.dias());

        BigDecimal valorTotal = veiculo.getValorDiaria().multiply(dias);

        veiculo.setDisponivel(false);

        veiculoRepositorio.save(veiculo);

        Locacao locacao = new Locacao(locacaoCreateDTO.dias(), valorTotal, cliente, veiculo);

        locacaoRepositorio.save(locacao);

        return locacaoMapping.locacaoResponseDTO(locacao);

    }

    public List<LocacaoResponseDTO> listarLocacoes(){
        return locacaoRepositorio.findAll()
                .stream()
                .map(locacaoMapping::locacaoResponseDTO)
                .toList();
    }

    public MensagemDTO deletarLocacao(
            Long id
    ){
        Locacao locacao = locacaoRepositorio.findById(id)
                .orElseThrow(()->new RuntimeException("Locaçao não existe"));
        Veiculo veiculo = locacao.getVeiculo();
        veiculo.setDisponivel(true);
        veiculoRepositorio.save(veiculo);
        locacaoRepositorio.delete(locacao);
        return new MensagemDTO("Veículo devolvido e locação encerrada!");
    }

    List<LocacaoResponseDTO>

}

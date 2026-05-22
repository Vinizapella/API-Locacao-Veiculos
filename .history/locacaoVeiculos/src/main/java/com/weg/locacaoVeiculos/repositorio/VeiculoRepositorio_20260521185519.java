package com.weg.locacaoVeiculos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.locacaoVeiculos.model.Veiculo;


@Repository
public interface VeiculoRepositorio extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByDisponivel(Boolean disponivel);

}

package com.weg.locacaoVeiculos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weg.locacaoVeiculos.model.Locacao;

public interface LocacaoRepositorio extends JpaRepository<Locacao, Long> {


    

}

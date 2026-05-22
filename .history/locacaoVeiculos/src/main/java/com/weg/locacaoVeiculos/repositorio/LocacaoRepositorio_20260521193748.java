package com.weg.locacaoVeiculos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.weg.locacaoVeiculos.model.Locacao;

public interface LocacaoRepositorio extends JpaRepository<Locacao, Long> {

    @Query
    (SELECT locacao
        FROM 
        Locacao locacao
        WHERE
        locacao.
    )

}

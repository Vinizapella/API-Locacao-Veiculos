package com.weg.locacaoVeiculos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.weg.locacaoVeiculos.model.Locacao;

public interface LocacaoRepositorio extends JpaRepository<Locacao, Long> {

    @Query("SELECT locacao FROM 
        Locacao locacao
        WHERE
        locacao.cliente.id = :idCliente"
    )
    List<Locacao>buscarLocacaoPorClienteId(@Param("idCliente")Long idCliente);

}

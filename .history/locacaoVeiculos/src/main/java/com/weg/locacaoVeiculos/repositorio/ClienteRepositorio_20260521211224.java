package com.weg.locacaoVeiculos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.weg.locacaoVeiculos.model.Cliente;
import com.weg.locacaoVeiculos.projection.ClienteGastoProjection;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

    @Query(value = "SELECT c.id AS id, c.nome AS nome, SUM(l.valor_total) AS totalGasto " +
                   "FROM cliente c " +
                   "INNER JOIN locacao l ON c.id = l.cliente_id " +
                   "GROUP BY c.id, c.nome", 
           nativeQuery = true)
    List<ClienteGastoProjection> obterRelatorioGastos();
    
}

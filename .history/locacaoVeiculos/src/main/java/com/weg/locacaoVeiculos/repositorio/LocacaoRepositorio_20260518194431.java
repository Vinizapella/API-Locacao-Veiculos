package com.weg.locacaoVeiculos.repositorio;

import com.weg.locacaoVeiculos.model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepositorio extends JpaRepository<Locacao, Long> {
}

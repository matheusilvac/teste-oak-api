package com.oak.teste_tecnico.repositorios;

import com.oak.teste_tecnico.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
    List<Produto> findAllByOrderByValorAsc();
    Optional<Produto> findByNome(String nome);
}

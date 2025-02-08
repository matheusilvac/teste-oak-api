package com.oak.teste_tecnico.service;

import com.oak.teste_tecnico.domain.entity.Produto;
import com.oak.teste_tecnico.exceptions.ProdutoJaExisteException;
import com.oak.teste_tecnico.repositorios.ProdutoRepositorio;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import com.oak.teste_tecnico.domain.dtos.ProdutoRequestDTO;
import com.oak.teste_tecnico.domain.dtos.ProdutoResponseDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    private final ProdutoRepositorio produtoRepository;

    public ProdutoService(ProdutoRepositorio produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvarProduto(ProdutoRequestDTO dto) {
        try {
            Produto produto = new Produto(dto);
            return produtoRepository.save(produto);
        } catch (DataIntegrityViolationException e) {
            throw new ProdutoJaExisteException("Produto já existe com o nome:" + "" + dto.nome());
        }
    }

    public List<ProdutoResponseDTO> listarProdutosOrdenadosPorValor() {
        return produtoRepository.findAllByOrderByValorAsc()
                .stream()
                .map(produto -> new ProdutoResponseDTO(produto.getNome(), produto.getValor()))
                .collect(Collectors.toList());
    }
}

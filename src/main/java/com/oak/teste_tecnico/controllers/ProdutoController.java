package com.oak.teste_tecnico.controllers;

import com.oak.teste_tecnico.domain.dtos.ProdutoRequestDTO;
import com.oak.teste_tecnico.domain.dtos.ProdutoResponseDTO;
import com.oak.teste_tecnico.domain.entity.Produto;
import com.oak.teste_tecnico.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody @Valid ProdutoRequestDTO dto) {
        Produto produto = produtoService.salvarProduto(dto);
        return ResponseEntity.ok(produto);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDTO>> listarProdutosOrdenados() {
        return ResponseEntity.ok(produtoService.listarProdutosOrdenadosPorValor());
    }
}

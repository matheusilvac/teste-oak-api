package com.oak.teste_tecnico.domain.dtos;

import java.math.BigDecimal;

public record ProdutoResponseDTO(
        String nome,
        BigDecimal valor
) {
}

package com.oak.teste_tecnico.domain.dtos;

import com.oak.teste_tecnico.domain.enums.DisponivelEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoRequestDTO (
        Long id,

        @NotBlank(message = "O nome é obrigatório")
        String nome,

        String descricao,

        @NotNull(message = "O valor é obrigatório")
        BigDecimal valor,

        @NotNull(message = "A disponibilidade é obrigatória.")
        DisponivelEnum disponivelEnum
){}

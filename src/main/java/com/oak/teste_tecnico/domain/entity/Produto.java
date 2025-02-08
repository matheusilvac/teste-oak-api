package com.oak.teste_tecnico.domain.entity;

import com.oak.teste_tecnico.domain.dtos.ProdutoRequestDTO;
import com.oak.teste_tecnico.domain.enums.DisponivelEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    private String descricao;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private DisponivelEnum disponivelEnum;

    public Produto() {
    }

    public Produto(ProdutoRequestDTO dto) {
        this.id = dto.id();
        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.valor = dto.valor();
        this.disponivelEnum = dto.disponivelEnum();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public DisponivelEnum getDisponivelEnum() {
        return disponivelEnum;
    }

    public void setDisponivelEnum(DisponivelEnum disponivelEnum) {
        this.disponivelEnum = disponivelEnum;
    }
}

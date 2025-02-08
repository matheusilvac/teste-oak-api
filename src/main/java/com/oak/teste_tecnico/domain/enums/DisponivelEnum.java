package com.oak.teste_tecnico.domain.enums;

public enum DisponivelEnum {
    SIM("SIM"),
    NAO("NÃO");

    private final String valor;

    DisponivelEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

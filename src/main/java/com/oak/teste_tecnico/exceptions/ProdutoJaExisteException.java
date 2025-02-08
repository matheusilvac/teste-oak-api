package com.oak.teste_tecnico.exceptions;

public class ProdutoJaExisteException extends RuntimeException{
    public ProdutoJaExisteException(String mensagem) {
        super(mensagem);
    }
}

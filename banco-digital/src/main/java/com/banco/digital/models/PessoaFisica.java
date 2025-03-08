package com.banco.digital.models;

import java.util.Date;

import lombok.Getter;

@Getter
public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, Date dataCadastro, String telefone, String email, String endereco, String cpf) {
        super(nome, dataCadastro, telefone, email, endereco);
        this.cpf = cpf;
    }
}

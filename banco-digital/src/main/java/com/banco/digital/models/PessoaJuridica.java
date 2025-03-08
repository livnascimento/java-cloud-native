package com.banco.digital.models;

import java.util.Date;

import lombok.Getter;

@Getter
public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, Date dataCadastro, String telefone, String email, String endereco, String cnpj) {
        super(nome, dataCadastro, telefone, email, endereco);
        this.cnpj = cnpj;
    }
}

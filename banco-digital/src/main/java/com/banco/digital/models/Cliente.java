package com.banco.digital.models;

import java.util.Date;

import lombok.Getter;

@Getter
public abstract class Cliente {
    private String nome;
    private Date dataCadastro;
    private String telefone;
    private String email;
    private String endereco;
    
    Cliente(String nome, Date dataCadastro, String telefone, String email, String endereco) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
}

package com.banco.digital.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta {

    private Cliente titular;
    private String numero;
    private String agencia;
    private Integer saldoEmCentavos;
    private boolean ativa = true;

    protected Conta(Cliente titular, String numero, String agencia, Integer saldoEmCentavos) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldoEmCentavos = saldoEmCentavos;
    }

    public abstract boolean saque(Integer valorEmCentavos);
    public abstract boolean transferencia(Conta contaDestino, Integer valorEmCentavos);
    
    public String extrato() {
        return String.format("Titular: %s%nConta: %s%nAgencia: %s%nR$ %.2f%n", titular.getNome(), numero, agencia,(double) getSaldoEmCentavos() / 100);
    }

    public boolean deposito(Integer valorEmCentavos) {
        this.saldoEmCentavos += valorEmCentavos;
        return true;
    }
}

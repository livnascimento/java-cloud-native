package com.banco.digital.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente extends Conta {

    private Integer limiteEmCentavos;

    public ContaCorrente (Cliente titular, String numero, String agencia, Integer saldoEmCentavos, Integer limiteEmCentavos) {
        super(titular, numero, agencia, saldoEmCentavos);
        this.limiteEmCentavos = limiteEmCentavos;
    }

    @Override
    public boolean saque(Integer valorEmCentavos) {
        if (valorEmCentavos > this.getSaldoEmCentavos() + this.getLimiteEmCentavos()){
            throw new UnsupportedOperationException("Saque não realizado: saldo insuficiente.");
        }

        if (valorEmCentavos > getSaldoEmCentavos()) {
            this.setLimiteEmCentavos(getLimiteEmCentavos() - Math.abs(getSaldoEmCentavos() - valorEmCentavos));

        }

        this.setSaldoEmCentavos(getSaldoEmCentavos() - valorEmCentavos);

        this.extrato();

        return true;
    }

    @Override
    public boolean transferencia(Conta contaDestino, Integer valorEmCentavos) {
        try {
            this.saque(valorEmCentavos);
            contaDestino.deposito(valorEmCentavos);

            return true;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Transferencia não realizada: saldo e limite insuficientes.");
        }
    }
}

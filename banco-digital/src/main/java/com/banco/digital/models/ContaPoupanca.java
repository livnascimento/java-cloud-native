package com.banco.digital.models;

public class ContaPoupanca extends Conta {

    public ContaPoupanca (Cliente titular, String numero, String agencia, Integer saldoEmCentavos) {
        super(titular, numero, agencia, saldoEmCentavos);
    }

    @Override
    public boolean saque(Integer valorEmCentavos) {
        if (valorEmCentavos > this.getSaldoEmCentavos()){
            throw new UnsupportedOperationException("Saque não realizado: saldo insuficiente.");
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
            throw new UnsupportedOperationException("Transferencia não realizada: saldo insuficiente.");
        }
    }
}

package com.banco.digital;

import java.util.ArrayList;
import java.util.Date;

import com.banco.digital.models.BancoDigital;
import com.banco.digital.models.Cliente;
import com.banco.digital.models.Conta;
import com.banco.digital.models.ContaCorrente;
import com.banco.digital.models.ContaPoupanca;
import com.banco.digital.models.PessoaFisica;
import com.banco.digital.models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        // Criando o banco digital
        BancoDigital banco = new BancoDigital();
        banco.setContas(new ArrayList<>());
        banco.setClientes(new ArrayList<>());

        // Criando clientes
        Cliente cliente1 = new PessoaFisica("João Silva", new Date(), "11999999999", "joao@email.com", "Rua A, 123", "123.456.789-00");
        Cliente cliente2 = new PessoaJuridica("Empresa XYZ", new Date(), "11888888888", "empresa@email.com", "Avenida B, 456", "12.345.678/0001-99");

        // Adicionando clientes ao banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Criando contas
        Conta contaPoupanca = new ContaPoupanca(cliente1, "12345-6", "0001", 50000);
        Conta contaCorrente = new ContaCorrente(cliente2, "54321-0", "0002", 100000, 50000);

        // Adicionando contas ao banco
        banco.adicionarConta(contaPoupanca);
        banco.adicionarConta(contaCorrente);

        // Operações bancárias
        contaPoupanca.deposito(10000);
        contaCorrente.saque(20000);
        contaPoupanca.transferencia(contaCorrente, 15000);

        // Exibindo extratos
        System.out.println(contaPoupanca.extrato());
        System.out.println(contaCorrente.extrato());
    }
}

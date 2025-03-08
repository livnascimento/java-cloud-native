package com.banco.digital.models;

import java.util.List;
import java.util.Optional;

import lombok.Setter;

@Setter
public class BancoDigital {

    private List<Conta> contas;
    private List<Cliente> clientes;

     public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public boolean removerConta(String numeroConta) {
        return this.contas.removeIf(conta -> conta.getNumero().equals(numeroConta));
    }

    public boolean modificarConta(String numeroConta, Conta novaConta) {
        Optional<Conta> contaExistente = this.contas.stream()
                .filter(conta -> conta.getNumero().equals(numeroConta))
                .findFirst();
        
        if (contaExistente.isPresent()) {
            int index = this.contas.indexOf(contaExistente.get());
            this.contas.set(index, novaConta);
            return true;
        }
        throw new UnsupportedOperationException("Alteração de dados não concluída: conta inexistente.");
    
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public boolean removerCliente(String nomeCliente) {
        return this.clientes.removeIf(cliente -> cliente.getNome().equals(nomeCliente));
    }

    public boolean modificarCliente(String nomeCliente, Cliente novoCliente) {
        Optional<Cliente> clienteExistente = this.clientes.stream()
                .filter(cliente -> cliente.getNome().equals(nomeCliente))
                .findFirst();
        
        if (clienteExistente.isPresent()) {
            int index = this.clientes.indexOf(clienteExistente.get());
            this.clientes.set(index, novoCliente);
            return true;
        }
        throw new UnsupportedOperationException("Alteração de dados não concluída: cliente inexistente.");
    }

}

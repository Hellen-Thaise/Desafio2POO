package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicoCliente {

    private static List<Cliente> clientes = new ArrayList<>();

    public ServicoCliente(List<Cliente> clientes) {
        this.clientes = clientes;

    }


    //método para adicionar um cliente

    public static Cliente adicionarCliente(String nome, int telefone, int numeroCliente) {
        Cliente cliente = new Cliente(nome, telefone, numeroCliente);
        clientes.add(cliente);
        System.out.println("\n ");
        System.out.println("Cliente cadastrado com sucesso!");
        return cliente;
    }

    public static void validaSeExisteCliente(String nome) throws Exception {
        boolean existeNome = false;
        for(Cliente cli: clientes ){
            if(cli.getNome().equals(nome)){
                existeNome = true;
            }
        }
        if(!existeNome){
            throw new Exception("Cliente não encontrado");
        }
    }

    // método para listar os clientes

    public static void listarClientes(){
        boolean nenhumCliente = false;
        for (Cliente referencia : clientes) {
            System.out.println("\n" + referencia);
        }if (!nenhumCliente){
            System.out.println("Nenhum cliente cadastrado!");
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Clientes: " + clientes);
        return retorno.toString();
    }

}

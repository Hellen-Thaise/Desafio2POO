package org.example;

import java.util.ArrayList;
import java.util.List;


public class ServiceCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    public ServiceCliente(List<Cliente> clientes) {
        this.clientes = clientes;

    }

    //método para adicionar um cliente

    public static Cliente adicionarCliente(String nome, String cpf, String email) {
        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
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
            throw new Exception("Cliente não encontrado!");
        }
    }

    //método para verificar se o cpf é repetido
    public static void VerificarSeCpfRepetido(String cpf){
        for (Cliente cli : clientes){
            while(cli.getCpf().equalsIgnoreCase(cpf)){
                System.out.println("CPF já cadastrado anteriormente, tente novamente! ");
                System.exit(0);
            }
        }
    }


    //método para válidar E-mail
    public static void validaEmailCliente(String email){
        try {
            if(!email.contains("@")){
                throw new NullPointerException();
            }
        } catch (NullPointerException e){
            System.out.println("E-mail inválido, tente novamente!");
            System.exit(0);
        }
    }

    public static void VerificarSeEmailRepetido(String email){
        for (Cliente cli : clientes){
            while(cli.getEmail().equalsIgnoreCase(email)){
                System.out.println("E-mail já cadastrado anteriormente, tente novamente! ");
                System.exit(0);
            }
        }
    }

    // método para listar os clientes

    public static void listarClientes(){
        boolean nenhumCliente = false;
        for (Cliente referencia : clientes) {
            System.out.println("\n" + referencia);
            nenhumCliente = true;
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

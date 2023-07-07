package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {

    private static List<Vendedor> vendedores = new ArrayList<>();

    public ServiceVendedor(List<Vendedor> vendedores) {
        this.vendedores = vendedores;

    }

    //método para adicionar um vendedor

    public static Vendedor adicionarVendedor(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedores.add(vendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
        return vendedor;
    }

    // método para listar os vendedores

    public static void listarVendedores() {
        boolean nenhumVendedor = false;
        for (Vendedor referencia1 : vendedores) {
            System.out.println("\n" + referencia1);
            nenhumVendedor = true;
        }if (!nenhumVendedor){
            System.out.println("Nenhum vendedor cadastrado!");
        }
    }

    public static void validaSeExisteVendedor(String nome) throws Exception {
        boolean existeNome = false;
        for(Vendedor vend: vendedores ){
            if(vend.getNome().equals(nome)){
                existeNome = true;
            }
        }
        if(!existeNome){
            throw new Exception("Vendedor não encontrado!");
        }
    }

    //método para verificar se o cpf é repetido
    public static void VerificarSeCpfRepetidoVendedor(String cpf){
        for (Vendedor vendedor : vendedores){
            while(vendedor.getCpf().equalsIgnoreCase(cpf)){
                System.out.println("CPF já cadastrado anteriormente, tente novamente! ");
                System.exit(0);
            }
        }
    }

    //método para válidar E-mail
    public static void validaEmailVendedor(String email){
        try {
            if(!email.contains("@")){
                throw new NullPointerException();
            }
        } catch (NullPointerException e){
            System.out.println("E-mail inválido, tente novamente!");
            System.exit(0);
        }
    }
    public static void VerificarSeEmailRepetidoVendedor(String email){
        for (Vendedor vendedor : vendedores){
            while(vendedor.getEmail().equalsIgnoreCase(email)){
                System.out.println("E-mail já cadastrado anteriormente, tente novamente! ");
                System.exit(0);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Vendedores: " + vendedores);
        return retorno.toString();
    }

}

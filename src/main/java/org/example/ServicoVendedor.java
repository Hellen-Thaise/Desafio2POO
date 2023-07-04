package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    private static List<Vendedor> vendedores = new ArrayList<>();

    public ServicoVendedor(List<Vendedor> vendedores) {
        this.vendedores = vendedores;

    }


    //método para adicionar um vendedor

    public static Vendedor adicionarVendedor(String nome, int telefone, int numeroVendedor) {
        Vendedor vendedor = new Vendedor(nome, telefone, numeroVendedor);
        vendedores.add(vendedor);
        System.out.println("\n ");
        System.out.println("Vendedor cadastrado com sucesso!");
        return vendedor;
    }

    // método para listar os vendedores

    public static void listarVendedores() {
        boolean nenhumVendedor = false;
        for (Vendedor referencia1 : vendedores) {
            System.out.println("\n" + referencia1);
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

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Vendedores: " + vendedores);
        return retorno.toString();
    }

}

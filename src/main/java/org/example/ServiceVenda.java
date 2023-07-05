package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    private static List<Venda> vendas = new ArrayList<>();

    public ServicoVenda(List<Venda> vendas) {
        this.vendas = vendas;
    }

    //método para adicionar uma venda

    public static Venda adicionarVenda(String nomeCliente, String nomeVendedor, double valorPago){
        Venda venda = new Venda(nomeCliente, nomeVendedor,valorPago, LocalDate.now());
        vendas.add(venda);
        System.out.println("Venda cadastrada com sucesso!");
        return venda;

    }
    public static void listarVenda() {
        boolean nenhumaVenda = false;
        for (Venda referencia : vendas) {
            System.out.println("\n" + referencia);
            nenhumaVenda = true;
        } if (!nenhumaVenda){
            System.out.println("Nenhuma venda cadastrada!");
        }
    }

    public static void validaValorVenda(Double valor) throws Exception {
        boolean valorValido = false;

        if(valor !=null && valor > 0) {
            valorValido = true;
        }
        if(!valorValido){
            throw new Exception("Valor inválido");
        }
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Vendas: " + vendas);
        return retorno.toString();
    }


}

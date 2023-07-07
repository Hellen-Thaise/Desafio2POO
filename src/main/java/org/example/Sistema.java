package org.example;

import java.util.Scanner;

public class Sistema {
    private static Scanner entradaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);

    }

    //método para receber a entrada de dados no cadastro de clientes:
    public static Cliente adicionarCliente() {
        try {
            String nome = entradaDados("Por favor, digite o nome do Cliente: ").nextLine();
            String cpf = entradaDados("Por favor, digite o número do CPF: ").nextLine();
            String email = entradaDados("Por favor, digite o E-mail do Cliente: ").nextLine();
            ServiceCliente.validaEmailCliente(email);
            ServiceCliente.VerificarSeEmailRepetido(email);
            ServiceCliente.VerificarSeCpfRepetido(cpf);
            return ServiceCliente.adicionarCliente(nome, cpf, email);
        }catch (Exception e){
            System.out.println("Erro identificado: " + e.getMessage());
            return null;
        }

    }

    //método para receber a entrada de dados no cadastro de vendedores:
    public static Vendedor adicionarVendedor() {
        String nome = entradaDados("Por favor, digite o nome do Vendedor: ").nextLine();
        String cpf = entradaDados("Por favor, digite o número do CPF: ").nextLine();
        String email = entradaDados("Por favor, digite o E-mail do Vendedor: ").nextLine();
        ServiceVendedor.VerificarSeCpfRepetidoVendedor(cpf);
        ServiceVendedor.validaEmailVendedor(email);
        ServiceVendedor.VerificarSeEmailRepetidoVendedor(email);
        return ServiceVendedor.adicionarVendedor(nome, cpf, email);
    }

    public static Venda adicionarVenda() {
        try {
            String nomeCliente = entradaDados("Por favor, digite o nome do Cliente: ").nextLine();
            ServiceCliente.validaSeExisteCliente(nomeCliente);

            String nomeVendedor = entradaDados("Por favor, digite o nome do Vendedor: ").nextLine();
            ServiceVendedor.validaSeExisteVendedor(nomeVendedor);

            Double valor = entradaDados("Por favor, digite o valor do produto").nextDouble();
            ServiceVenda.validaValorVenda(valor);

            return ServiceVenda.adicionarVenda(nomeCliente, nomeVendedor, valor);
        }catch (Exception e) {
            System.out.println("Erro identificado: " + e.getMessage());
            return null;
        }
    }

    public static void menu() {
        System.out.println("\n ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" ***        Bem-vindo ao Sistema de Vendas       *** ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("\n ");
        System.out.println("| 1 - Adicionar Cliente              |");
        System.out.println("| 2 - Exibir Clientes cadastrados    |");
        System.out.println("| 3 - Adicionar Vendedor             |");
        System.out.println("| 4 - Exibir Vendedores cadastrados  |");
        System.out.println("| 5 - Adicionar Vendas               |");
        System.out.println("| 6 - Exibir Vendas cadastradas      |");
        System.out.println("| 7 - Sair do Sistema                |");
    }
    //método para executar o programa completo

    public static boolean executar() throws Exception {
        boolean operarMenu = true;
        while (operarMenu) {
            menu();
            int escolhaUsuario = entradaDados("\n ----- Selecione uma opção que deseja realizar: -----").nextInt();
            if (escolhaUsuario == 1) {
                Cliente cliente = new Cliente();
                cliente = adicionarCliente();
            } else if (escolhaUsuario == 2) {
                System.out.println("------------------------");
                System.out.println("Clientes cadastrados:   ");
                System.out.println("------------------------");
                ServiceCliente.listarClientes();
            }
            if (escolhaUsuario == 3) {
                Vendedor vendedor = new Vendedor();
                vendedor = adicionarVendedor();
            }  else if (escolhaUsuario == 4) {
                    System.out.println("------------------------");
                    System.out.println("Vendedores cadastrados: ");
                    System.out.println("------------------------");
                    ServiceVendedor.listarVendedores();

            }if (escolhaUsuario == 5) {

                 adicionarVenda();
            }  else if (escolhaUsuario == 6) {
                System.out.println("------------------------");
                System.out.println("Vendas cadastradas: ");
                System.out.println("------------------------");
                ServiceVenda.listarVenda();

            }

            else if (escolhaUsuario == 7) {
                System.out.println("Obrigado(a) por utilizar nosso sistema, até logo!");
                operarMenu = false;
            }

        }
        return operarMenu;
    }




}

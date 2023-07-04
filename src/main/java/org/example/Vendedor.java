package org.example;

public class Vendedor {
    private String nome;
    private int telefone;
    private int numeroVendedor;

    public Vendedor(String nome, int telefone, int numeroVendedor) {
        this.nome = nome;
        this.telefone = telefone;
        this.numeroVendedor = numeroVendedor;
    }

    public Vendedor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNumeroVendedor() {
        return numeroVendedor;
    }

    public void setNumeroVendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    @Override
    public String toString() {
        return "Nome do Vendedor: " + nome + "\nNúmero de telefone: " + telefone + "\nNúmero do vendedor: " + numeroVendedor;
    }
}

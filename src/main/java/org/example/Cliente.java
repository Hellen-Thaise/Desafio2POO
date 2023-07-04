package org.example;

import java.util.Date;


    public class Cliente {
        private String nome;
        private int telefone;
        private int numeroCliente;

        public Cliente(String nome, int telefone, int numeroCliente) {
            this.nome = nome;
            this.telefone = telefone;
            this.numeroCliente = numeroCliente;
        }

        public Cliente() {

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

        public int getNumeroCliente() {
            return numeroCliente;
        }

        public void setNumeroCliente(int numeroCliente) {
            this.numeroCliente = numeroCliente;
        }

        @Override
        public String toString() {
            return "Nome do Cliente: " + nome + "\nNúmero de telefone: " + telefone + "\nNúmero do cliente: " + numeroCliente;
        }
    }



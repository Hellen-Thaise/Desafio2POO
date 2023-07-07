package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Venda {
    private String nomeCliente;
    private String nomeVendedor;
    private Double valorPago;
    private LocalDate dataRegistro;

    public Venda(String nomeCliente, String nomeVendedor, Double valorPago, LocalDate dataRegistro) {
        this.nomeCliente = nomeCliente;
        this.nomeVendedor = nomeVendedor;
        this.valorPago = valorPago;
        this.dataRegistro = dataRegistro;
    }


    @Override
    public String toString() {
        return "Venda:" +
                "\nNome do Cliente: " + nomeCliente +
                "\nNome do Vendedor: " + nomeVendedor +
                "\nValor Pago: " + valorPago +
                "\nData do Registro: " + dataRegistro;
    }


}

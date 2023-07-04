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

    public Venda() {

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", nomeVendedor='" + nomeVendedor + '\'' +
                ", valorPago=" + valorPago +
                ", dataRegistro=" + dataRegistro +
                '}';
    }
}

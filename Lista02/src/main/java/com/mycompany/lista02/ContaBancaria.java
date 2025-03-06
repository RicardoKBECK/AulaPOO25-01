/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

/**
 *
 * @author Master
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero.trim().isEmpty()) {
            throw new IllegalArgumentException("O número da conta é inválido");
        }

        this.numero = numero;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito está inválido");
        }

        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque está inválido");
        }

        if (valor > saldo) {
            throw new IllegalArgumentException("O valor é maior que o saldo");
        }

        saldo -= valor;
    }

    public void transferir(ContaBancaria destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

}

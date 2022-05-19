package com.anthony;

public abstract class Cuenta {
    String nombre;
    double saldo = 0;

    public void abonar(double val) {
        saldo+=val;
    }

    public double saldoActual(){
        return saldo;
    };

    public abstract String cargar(double val);
    public abstract double calcInteres(double val);
}

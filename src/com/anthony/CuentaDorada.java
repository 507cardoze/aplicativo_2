package com.anthony;

public class CuentaDorada extends Cuenta {

    int interes = 5;

    @Override
    public String cargar(double val) {
        saldo-=val;
        saldo-=calcInteres(val);
        return "Carga de cuenta exitosa";
    }

    @Override
    public double calcInteres(double val) {
        return interes / 100 * val;
    }
}

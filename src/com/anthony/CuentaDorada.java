package com.anthony;

public class CuentaDorada extends Cuenta {

    double interes = 0.05;

    @Override
    public String cargar(double val) {
        saldo-=val;
        saldo-=calcInteres(val);
        return "Carga de cuenta exitosa";
    }

    @Override
    public double calcInteres(double val) {
        return val * interes;
    }
}

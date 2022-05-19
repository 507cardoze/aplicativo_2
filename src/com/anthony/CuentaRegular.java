package com.anthony;

public class CuentaRegular extends Cuenta {

    double interes = 0.06;
    int cargoFijo = 1;


    @Override
    public String cargar(double val) {
        if(saldoActual() < val + calcInteres(val)){
            return "Cuenta sobregirada.";
        } else{
            saldo-=val;
            saldo-=calcInteres(val);
            return "Retiro de cuenta exitoso";
        }
    }

    @Override
    public double calcInteres(double val) {
        return (val * interes) + cargoFijo;
    }
}

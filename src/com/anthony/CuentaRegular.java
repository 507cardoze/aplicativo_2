package com.anthony;

public class CuentaRegular extends Cuenta {

    int interes = 6;
    int cargoFijo = 1;


    @Override
    public String cargar(double val) {
        if(saldo <= 0){
            return "Cuenta sobregirada.";
        } else{
            saldo-=val;
            saldo-=calcInteres(val);
            return "Carga de cuenta exitosa";
        }
    }

    @Override
    public double calcInteres(double val) {
        return (interes / 100 * val) + cargoFijo;
    }
}

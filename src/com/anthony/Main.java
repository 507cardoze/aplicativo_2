package com.anthony;

import java.io.*;
import java.lang.invoke.SwitchPoint;

public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.print("Bienvenid@ a International Bank\n\nInserte su nombre porfavor: ");
    String nombre = br.readLine();
    System.out.print("\nMenú\nSeleccione las acciones a realizar\n1. Crear una cuenta\n2. Consultar Cuenta\n\n");
    byte tipoCuenta = (byte)Integer.parseInt(br.readLine());
    CuentaRegular obj = new CuentaRegular();
    CuentaDorada obje = new CuentaDorada();
    byte opcion;
    switch(tipoCuenta){
        case 1->{
            System.out.print("¿Qué tipo de cuenta quisiera crear?\n1. Cuenta Regular\n2. Cuenta Dorada\n");
            opcion  = (byte) Integer.parseInt(br.readLine());
            if (opcion == 1){
                System.out.print("Escriba el monto que desea depositar: ");
                obj.saldo = Float.valueOf(br.readLine());
                System.out.print("Nombre de la cuenta: "+nombre+"\nEstado de Cuenta: "+obj.cargar(obj.saldo)+"");
            }


        }
        case 2->{

        }
    }
    }
}
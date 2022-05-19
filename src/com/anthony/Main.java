package com.anthony;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Cuenta cuentaReg = new CuentaRegular();
        Cuenta cuentaDor = new CuentaDorada();
        int confirm = 1;
        int tipoCuenta = 0;
        String nombre = null;
        int option;


        System.out.println("Bienvenid@ a International Bank");
        while(nombre == null){
            System.out.println("Introduzca su nombre: ");
            nombre = sc.nextLine();
        }

        System.out.println("Que tipo de cuenta desea crear? 1 para cuenta regular, 2 para cuenta dorada.");
        tipoCuenta = sc.nextInt();

        if(tipoCuenta == 1){
            cuentaReg.nombre = nombre;
        }else {
            cuentaDor.nombre = nombre;
        }


        while (confirm == 1) {
            System.out.println("MENU");
            if(tipoCuenta == 1){
                System.out.println("cliente: "  + cuentaReg.nombre);
                System.out.println("tipo de cuenta: Regular");
            }else {
                System.out.println("cliente: "  + cuentaDor.nombre);
                System.out.println("tipo de cuenta: Dorada");
            }
            System.out.println();
            System.out.println("1. Consultar saldo");
            System.out.println("2. Deposito de dinero");
            System.out.println("3. Retiro de dinero");
            option = sc.nextInt();

            switch(option){
                case 1: {
                    // consultar
                    if(tipoCuenta == 1){
                        System.out.println("Su saldo actual es de: "  + cuentaReg.saldoActual());
                    }else {
                        System.out.println("Su saldo actual es de: "  + cuentaDor.saldoActual());
                    }
                    break;
                }

                case 2: {
                    /// depositar
                    System.out.println("Cuanto desea abonar? ");
                    if(tipoCuenta == 1){
                        cuentaReg.abonar(sc.nextDouble());
                    }else {
                        cuentaDor.abonar(sc.nextDouble());
                    }
                    break;
                }

                case 3: {
                    //retiro

                    System.out.println("Cuanto desea retirar? ");
                    if(tipoCuenta == 1){
                        System.out.println(cuentaReg.cargar(sc.nextDouble()));
                    }else {
                        System.out.println(cuentaDor.cargar(sc.nextDouble()));
                    }

                    break;
                }

                default: break;
            }

            System.out.println("Desea continuar? 1 para continuar 2 para salir");
            confirm = sc.nextInt();
        }

        System.out.println("---- Muchas gracias ----");
    }
}

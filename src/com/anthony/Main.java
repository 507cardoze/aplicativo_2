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




//    System.out.print("Bienvenid@ a International Bank\n\nInserte su nombre porfavor: ");
//    String nombre = br.readLine();
//    System.out.print("\nMenú\nSeleccione las acciones a realizar\n1. Crear una cuenta\n2. Consultar Cuenta\n\n");
//    byte tipoCuenta = (byte)Integer.parseInt(br.readLine());
//    CuentaRegular obj = new CuentaRegular();
//    CuentaDorada obje = new CuentaDorada();
//    byte opcion;
//    switch(tipoCuenta){
//        case 1->{
//            System.out.print("¿Qué tipo de cuenta quisiera crear?\n1. Cuenta Regular\n2. Cuenta Dorada\n");
//            opcion  = (byte) Integer.parseInt(br.readLine());
//            if (opcion == 1){
//                System.out.print("Escriba el monto que desea depositar: ");
//                obj.saldo = Float.valueOf(br.readLine());
//                System.out.print("Nombre de la cuenta: "+nombre+"\nEstado de Cuenta: "+obj.cargar(obj.saldo)+"");
//            }
//
//
//        }
//        case 2->{
//
//        }
//    }
//    }
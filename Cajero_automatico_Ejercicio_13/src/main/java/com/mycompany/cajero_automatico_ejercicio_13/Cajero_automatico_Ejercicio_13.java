package com.mycompany.cajero_automatico_ejercicio_13;

import java.util.Scanner;

public class Cajero_automatico_Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentosRestantes = 3;
        boolean bloqueado = false;

        double saldoCordobas = 0;
        double saldoDolares = 0;
        boolean continuar = true;

        System.out.println("Bienvenido al Cajero Automático");

        while (intentosRestantes > 0 && !bloqueado) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo en córdobas: C$" + saldoCordobas);
                    System.out.println("Saldo en dólares: $" + saldoDolares);
                    break;

                case 2:
                    System.out.println("Seleccione la cuenta (C para córdobas, D para dólares):");
                    char cuenta = scanner.next().charAt(0);

                    if (cuenta == 'C' || cuenta == 'c') {
                        System.out.print("Ingrese el monto a depositar en córdobas: C$");
                        double depositoCordobas = scanner.nextDouble();
                        saldoCordobas += depositoCordobas;
                    } else if (cuenta == 'D' || cuenta == 'd') {
                        System.out.print("Ingrese el monto a depositar en dólares: $");
                        double depositoDolares = scanner.nextDouble();
                        saldoDolares += depositoDolares;
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;

                case 3:
                    System.out.println("Seleccione la cuenta (C para córdobas, D para dólares):");
                    cuenta = scanner.next().charAt(0);

                    if (cuenta == 'C' || cuenta == 'c') {
                        System.out.print("Ingrese el monto a retirar en córdobas: C$");
                        double retiroCordobas = scanner.nextDouble();
                        if (retiroCordobas <= saldoCordobas) {
                            saldoCordobas -= retiroCordobas;
                        } else {
                            System.out.println("Saldo insuficiente. Realice un depósito.");
                        }
                    } else if (cuenta == 'D' || cuenta == 'd') {
                        System.out.print("Ingrese el monto a retirar en dólares: $");
                        double retiroDolares = scanner.nextDouble();
                        if (retiroDolares <= saldoDolares) {
                            saldoDolares -= retiroDolares;
                        } else {
                            System.out.println("Saldo insuficiente. Realice un depósito.");
                        }
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

            if (continuar) {
                System.out.print("¿Desea realizar otra transacción? (Sí/No): ");
                String respuesta = scanner.next();
                continuar = respuesta.equalsIgnoreCase("Sí");
            }

            if (!continuar) {
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("Le quedan " + intentosRestantes + " intentos.");
                } else {
                    bloqueado = true;
                    System.out.println("Se ha bloqueado el acceso al cajero automático.");
                }
            }
        }

        if (bloqueado) {
            System.out.println("\n¡Cajero automático bloqueado!");
        } else {
            System.out.println("\n¡Gracias por utilizar el Cajero Automático!");
            System.out.println("Saldo en córdobas: C$" + saldoCordobas);
            System.out.println("Saldo en dólares: $" + saldoDolares);
        }

        scanner.close();
    }
}

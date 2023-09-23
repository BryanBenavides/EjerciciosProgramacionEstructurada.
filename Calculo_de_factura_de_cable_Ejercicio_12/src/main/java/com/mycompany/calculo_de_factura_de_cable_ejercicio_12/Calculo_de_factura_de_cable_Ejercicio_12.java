package com.mycompany.calculo_de_factura_de_cable_ejercicio_12;

import java.util.Scanner;

public class Calculo_de_factura_de_cable_Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese el número de cuenta del cliente: ");
            int numeroCuenta = scanner.nextInt();

            System.out.print("Ingrese el código de cliente (R para residencial, N para negocio): ");
            char codigoCliente = scanner.next().charAt(0);

            double importeFacturacion = 0;

            if (codigoCliente == 'R' || codigoCliente == 'r') {
                importeFacturacion = calcularFacturaResidencial(scanner);
            } else if (codigoCliente == 'N' || codigoCliente == 'n') {
                importeFacturacion = calcularFacturaNegocios(scanner);
            } else {
                System.out.println("Código de cliente no válido.");
                intentos--;
                if (intentos == 0) {
                    System.out.println("Se han agotado los intentos.");
                } else {
                    System.out.println("Intentos restantes: " + intentos);
                }
                continue;
            }

            System.out.println("Número de cuenta del cliente: " + numeroCuenta);
            System.out.println("Importe de facturación: C$" + importeFacturacion);
            break;
        }

        scanner.close();
    }

    public static double calcularFacturaResidencial(Scanner scanner) {
        double factura = 0;

        factura += 4.50;

        factura += 20.50;

        System.out.print("Ingrese el número de canales Premium: ");
        int numCanalesPremium = scanner.nextInt();

        factura += numCanalesPremium * 7.50;

        return factura;
    }

    public static double calcularFacturaNegocios(Scanner scanner) {
        double factura = 0;

        factura += 15.00;

        System.out.print("Ingrese el número de conexiones de servicio básico: ");
        int numConexionesBasico = scanner.nextInt();

        if (numConexionesBasico <= 10) {
            factura += 75.00;
        } else {
            factura += 75.00 + (numConexionesBasico - 10) * 5.00;
        }

        System.out.print("Ingrese el número de canales Premium: ");
        int numCanalesPremium = scanner.nextInt();

        factura += numCanalesPremium * 50.00;

        return factura;
    }
}

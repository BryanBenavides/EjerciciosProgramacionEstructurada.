package com.mycompany.conversiones_de_sistemas_numericos_ejercicio_33;

import java.util.Scanner;

public class Conversiones_de_sistemas_numericos_Ejercicio_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        final int maxIntentos = 3;

        while (intentos < maxIntentos) {
            System.out.println("Bienvenido al programa de conversión de sistemas numéricos.");
            System.out.println("Por favor, seleccione el sistema numérico de entrada:");
            System.out.println("1. Binario");
            System.out.println("2. Octal");
            System.out.println("3. Decimal");
            System.out.println("4. Hexadecimal");
            int sistemaEntrada = scanner.nextInt();

            System.out.println("Seleccione el sistema numérico al que desea convertir:");
            System.out.println("1. Binario");
            System.out.println("2. Octal");
            System.out.println("3. Decimal");
            System.out.println("4. Hexadecimal");
            int sistemaSalida = scanner.nextInt();

            System.out.print("Ingrese el número a convertir: ");
            String numero = scanner.next();

            String resultado = "";

            // Realizar la conversión según los sistemas seleccionados
            switch (sistemaEntrada) {
                case 1: // Binario a otros sistemas
                    int decimal = Integer.parseInt(numero, 2);
                    switch (sistemaSalida) {
                        case 2:
                            resultado = Integer.toOctalString(decimal);
                            break;
                        case 3:
                            resultado = Integer.toString(decimal);
                            break;
                        case 4:
                            resultado = Integer.toHexString(decimal).toUpperCase();
                            break;
                        default:
                            System.out.println("Selección de sistema de salida no válida.");
                            intentos++;
                            continue;
                    }
                    break;
                case 2: // Octal a otros sistemas
                    decimal = Integer.parseInt(numero, 8);
                    switch (sistemaSalida) {
                        case 1:
                            resultado = Integer.toBinaryString(decimal);
                            break;
                        case 3:
                            resultado = Integer.toString(decimal);
                            break;
                        case 4:
                            resultado = Integer.toHexString(decimal).toUpperCase();
                            break;
                        default:
                            System.out.println("Selección de sistema de salida no válida.");
                            intentos++;
                            continue;
                    }
                    break;
                case 3: // Decimal a otros sistemas
                    decimal = Integer.parseInt(numero);
                    switch (sistemaSalida) {
                        case 1:
                            resultado = Integer.toBinaryString(decimal);
                            break;
                        case 2:
                            resultado = Integer.toOctalString(decimal);
                            break;
                        case 4:
                            resultado = Integer.toHexString(decimal).toUpperCase();
                            break;
                        default:
                            System.out.println("Selección de sistema de salida no válida.");
                            intentos++;
                            continue;
                    }
                    break;
                case 4: // Hexadecimal a otros sistemas
                    decimal = Integer.parseInt(numero, 16);
                    switch (sistemaSalida) {
                        case 1:
                            resultado = Integer.toBinaryString(decimal);
                            break;
                        case 2:
                            resultado = Integer.toOctalString(decimal);
                            break;
                        case 3:
                            resultado = Integer.toString(decimal);
                            break;
                        default:
                            System.out.println("Selección de sistema de salida no válida.");
                            intentos++;
                            continue;
                    }
                    break;
                default:
                    System.out.println("Selección de sistema de entrada no válida.");
                    intentos++;
                    continue;
            }

            // Mostrar el resultado
            System.out.println("Número original (" + obtenerNombreSistema(sistemaEntrada) + "): " + numero);
            System.out.println("Número convertido (" + obtenerNombreSistema(sistemaSalida) + "): " + resultado);
            break; // Salir del bucle después de una entrada válida
        }

        if (intentos == maxIntentos) {
            System.out.println("Ha alcanzado el número máximo de intentos. Adiós.");
        }

        scanner.close();
    }

    // Función para obtener el nombre del sistema numérico
    public static String obtenerNombreSistema(int sistema) {
        switch (sistema) {
            case 1:
                return "Binario";
            case 2:
                return "Octal";
            case 3:
                return "Decimal";
            case 4:
                return "Hexadecimal";
            default:
                return "Desconocido";
        }
    }
}

package com.mycompany.validacion_de_contrasena_ejercicio_25;

import java.util.Scanner;

public class Validacion_de_contrasena_Ejercicio_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        final int maxIntentos = 3;

        while (intentos < maxIntentos) {
            System.out.println("Ingrese una contraseña (entre 6 y 10 caracteres, al menos una letra y un dígito):");
            String contrasena = scanner.nextLine();

            if (contrasena.length() < 6 || contrasena.length() > 10) {
                System.out.println("La contraseña debe tener entre 6 y 10 caracteres.");
                intentos++;
                continue;
            }

            boolean contieneLetra = false;
            boolean contieneDigito = false;

            for (char c : contrasena.toCharArray()) {
                if (Character.isLetter(c)) {
                    contieneLetra = true;
                } else if (Character.isDigit(c)) {
                    contieneDigito = true;
                }
            }

            if (!contieneLetra || !contieneDigito) {
                System.out.println("La contraseña debe contener al menos una letra y un dígito.");
                intentos++;
                continue;
            }

            // Solicitar la confirmación de la contraseña
            System.out.println("Confirme la contraseña ingresada:");
            String confirmacion = scanner.nextLine();

            if (contrasena.equals(confirmacion)) {
                System.out.println("Contraseña aceptada. ¡Registro exitoso!");
                break;
            } else {
                System.out.println("Las contraseñas no coinciden. Inténtelo de nuevo.");
                intentos++;
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Ha alcanzado el número máximo de intentos. Registro fallido.");
        }

        scanner.close();
    }
}

package com.mycompany.formula_general_ejercicio_4;

import java.util.Scanner;

public class Formula_general_Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese el valor de a: ");
            double a = scanner.nextDouble();

            System.out.print("Ingrese el valor de b: ");
            double b = scanner.nextDouble();

            System.out.print("Ingrese el valor de c: ");
            double c = scanner.nextDouble();

            double discriminante = b * b - 4 * a * c;

            if (discriminante > 0) {
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
                break;
            } else if (discriminante == 0) {
                double raiz = -b / (2 * a);
                System.out.println("La raíz es: " + raiz);
                break;
            } else {
                System.out.println("El discriminante es negativo, las raíces son complejas.");
                intentos--;

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus intentos.");
                }
            }
        }

        scanner.close();
    }
}

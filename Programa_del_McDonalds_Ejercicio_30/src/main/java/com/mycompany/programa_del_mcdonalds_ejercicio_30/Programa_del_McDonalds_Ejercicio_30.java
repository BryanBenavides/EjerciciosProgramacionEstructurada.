package com.mycompany.programa_del_mcdonalds_ejercicio_30;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Programa_del_McDonalds_Ejercicio_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        final int maxIntentos = 3;

        while (true) {
            Map<String, Double> menu = new HashMap<>();
            menu.put("1. Big Mac", 5.99);
            menu.put("2. McNuggets (10 piezas)", 4.99);
            menu.put("3. Quarter Pounder with Cheese", 6.49);
            menu.put("4. Filet-O-Fish", 4.29);
            menu.put("5. Ensalada de Pollo", 5.99);

            System.out.println("Menú de McDonald's:");
            for (Map.Entry<String, Double> entry : menu.entrySet()) {
                System.out.println(entry.getKey() + " - $" + entry.getValue());
            }

            Map<String, Integer> orden = new HashMap<>();
            double total = 0.0;

            while (true) {
                System.out.print("Seleccione un número de platillo (0 para finalizar): ");
                int seleccion = scanner.nextInt();
                scanner.nextLine();

                if (seleccion == 0) {
                    break;
                } else if (seleccion >= 1 && seleccion <= menu.size()) {
                    String platillo = "";
                    int contador = 0;
                    for (Map.Entry<String, Double> entry : menu.entrySet()) {
                        contador++;
                        if (contador == seleccion) {
                            platillo = entry.getKey();
                            break;
                        }
                    }

                    if (orden.containsKey(platillo)) {
                        orden.put(platillo, orden.get(platillo) + 1);
                    } else {
                        orden.put(platillo, 1);
                    }
                    total += menu.get(platillo);
                } else {
                    System.out.println("Selección inválida. Inténtelo de nuevo.");
                }
            }

            System.out.println("\nDetalle de la factura:");
            for (Map.Entry<String, Integer> entry : orden.entrySet()) {
                System.out.println(entry.getKey() + " - Cantidad: " + entry.getValue());
            }
            System.out.println("Total a pagar: $" + total);

            intentos++;

            if (intentos >= maxIntentos) {
                System.out.println("Ha alcanzado el número máximo de intentos. Hasta luego.");
                break;
            }

            System.out.println("¿Desea hacer otro pedido? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        scanner.close();
    }
}

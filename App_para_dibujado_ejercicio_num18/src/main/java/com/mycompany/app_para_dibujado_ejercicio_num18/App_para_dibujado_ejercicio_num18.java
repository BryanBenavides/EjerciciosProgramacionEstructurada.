package com.mycompany.app_para_dibujado_ejercicio_num18;

import java.util.Scanner;

public class App_para_dibujado_ejercicio_num18 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 0;
        final int maxIntentos = 3;

        while (intentos < maxIntentos) {
        System.out.println("Seleccione una figura geométrica para dibujar:");
        
        System.out.println("1. Triángulo Rectángulo");
        
        System.out.println("2. Cuadrado");
        
        System.out.println("3. Círculo");
        
        System.out.println("4. Paralelogramo");
        
        System.out.println("5. Triángulo Equilátero");
        
        System.out.println("6. Rombo");
        
        System.out.println("7. Elipse");
        
        System.out.println("8. Trapecio");
        
        System.out.println("9. Pentagono");
        
        System.out.println("10. Rectangulo");
        
        int opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    dibujarTrianguloRectangulo();
                    break;
                case 2:
                    dibujarCuadrado();
                    break;
                case 3:
                    dibujarCirculo();
                    break;
                case 4:
                    dibujarParalelogramo();
                    break;
                case 5:
                    dibujarTrianguloEquilatero();
                    break;
                case 6:
                    dibujarRombo();
                    break;
                case 7:
                    dibujarElipse();
                    break;
                case 8:
                    dibujarTrapecio();
                    break;
                case 9:
                    dibujarPentagono();
                    break;
                case 10:
                    dibujarRectangulo();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            intentos++;

            if (intentos < maxIntentos) {
                System.out.println("Intento #" + (intentos + 1));
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Se han agotado los intentos.");
        }

        lector.close();
    }
    public static void dibujarTrianguloRectangulo() {
        int altura;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la altura del triángulo rectángulo:");
        altura = lector.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void dibujarCuadrado() {
        int lado;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado del cuadrado:");
        lado = lector.nextInt();
        
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void dibujarCirculo() {
        int radio;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo:");
        radio = lector.nextInt();
        
        for (int i = -radio; i <= radio; i++) {
            for (int j = -radio; j <= radio; j++) {
                if (i * i + j * j <= radio * radio) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void dibujarParalelogramo() {
        int filas, columnas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas del paralelogramo:");
        filas = scanner.nextInt();
        System.out.println("Ingrese el número de columnas del paralelogramo:");
        columnas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= columnas; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }
    }
    
    public static void dibujarTrianguloEquilatero() {
        int altura;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la altura del triángulo equilátero:");
        altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            // Espacios en blanco para alinear el triángulo
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos para dibujar el triángulo
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void dibujarRombo() {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas para el rombo (debe ser impar):");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("El número de filas debe ser impar para dibujar un rombo.");
            return;
        }

        int espacios = n / 2;
        int asteriscos = 1;

        // Dibuja la parte superior del rombo
        for (int i = 1; i <= n; i += 2) {
            
            // Espacios
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();
            espacios--;
            asteriscos += 2;
        }

        // Dibuja la parte inferior del rombo
        espacios = 1;
        asteriscos = n - 2;

        for (int i = n - 2; i >= 1; i -= 2) {
            // Espacios
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();
            espacios++;
            asteriscos -= 2;
        }
    }
    
    public static void dibujarElipse() {
        int filas, columnas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas para la elipse:");
        filas = scanner.nextInt();
        System.out.println("Ingrese el número de columnas para la elipse:");
        columnas = scanner.nextInt();

        double radioX = columnas / 2.0;
        double radioY = filas / 2.0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                double x = j - radioX;
                double y = i - radioY;

                if ((x * x) / (radioX * radioX) + (y * y) / (radioY * radioY) <= 1.0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void dibujarTrapecio() {
        int baseMayor, baseMenor, altura;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de la base mayor del trapecio:");
        baseMayor = scanner.nextInt();
        System.out.println("Ingrese la longitud de la base menor del trapecio:");
        baseMenor = scanner.nextInt();
        System.out.println("Ingrese la altura del trapecio:");
        altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < baseMayor + i; j++) {
                if (j < i || j >= baseMayor + i - (altura - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    public static void dibujarPentagono() {
    int lado;
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese el tamaño del lado del pentágono:");
    lado = lector.nextInt();

    if (lado < 2) {
        System.out.println("El tamaño del lado debe ser mayor o igual a 2.");
        return;
    }

    // Dibuja el pentágono
    for (int i = 1; i <= lado; i++) {
        // Espacios en blanco para alinear el pentágono
        for (int j = 1; j <= lado - i; j++) {
            System.out.print(" ");
        }

        // Asteriscos para dibujar el pentágono
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
    
    public static void dibujarRectangulo() {
    int ancho, alto;
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese el ancho del rectángulo:");
    ancho = lector.nextInt();
    System.out.println("Ingrese la altura del rectángulo:");
    alto = lector.nextInt();

    if (ancho < 2 || alto < 2) {
        System.out.println("El ancho y la altura deben ser mayores o iguales a 2.");
        return;
    }

    // Dibuja el rectángulo
    for (int i = 1; i <= alto; i++) {
        for (int j = 1; j <= ancho; j++) {
            if (i == 1 || i == alto || j == 1 || j == ancho) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
 }

}
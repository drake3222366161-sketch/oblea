

package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author KRIST
 */
public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // CASO BASE
            return 1;
        } else {
            return n * factorial(n - 1); // Paso recursivo
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();

        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}

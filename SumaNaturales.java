

package com.mycompany.sumanaturales;

import java.util.Scanner;

/**
 *
 * @author KRIST
 */
public class SumaNaturales {
    public static int sumaNaturales(int n) {
        if (n == 1) { 
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();

        int resultado = sumaNaturales(numero);
        System.out.println("La suma de los primeros " + numero + " números naturales es: " + resultado);
    }
}

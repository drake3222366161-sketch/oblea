
package com.mycompany.cuentaregresiva;

import java.util.Scanner;

/**
 *
 * @author KRIST
 */
public class CuentaRegresiva {
    
    public static void cuentaRegresiva(int n) {
        if (n == 0) { 
            return;
        } else {
            System.out.println(n);
            cuentaRegresiva(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();

        System.out.println("Cuenta regresiva:");
        cuentaRegresiva(numero);
    }
}

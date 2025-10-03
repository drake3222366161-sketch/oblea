

package com.mycompany.recorrervector;

import java.util.Scanner;

/**
 *
 * @author KRIST
 */
public class RecorrerVector {
    public static void recorrer(int[] vector, int indice) {
        if (indice < vector.length) { 
            System.out.println("Elemento en posición " + indice + ": " + vector[indice]);
            recorrer(vector, indice + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el tamaño del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        
        // Llenar el vector con datos ingresados por el usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el elemento " + (i+1) + ": ");
            vector[i] = sc.nextInt();
        }
        
        System.out.println("\n--- Recorriendo el vector ---");
        recorrer(vector, 0); // iniciamos desde el índice 0
    }
    }


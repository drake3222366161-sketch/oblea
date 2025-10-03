
package com.mycompany.contarvocales;

import java.util.Scanner;

/**
 *
 * @author KRIST
 */
public class ContarVocales {
    public static int contarVocales(String texto) {
        texto = texto.toLowerCase(); 
        if (texto.isEmpty()) { 
            return 0;
        } else {
            char letra = texto.charAt(0);
            int suma = (esVocal(letra)) ? 1 : 0; 
            return suma + contarVocales(texto.substring(1)); 
        }
        
        }
    public static boolean esVocal(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String palabra = sc.nextLine();

        int cantidad = contarVocales(palabra);
        System.out.println("La cantidad de vocales es: " + cantidad);
    }
}

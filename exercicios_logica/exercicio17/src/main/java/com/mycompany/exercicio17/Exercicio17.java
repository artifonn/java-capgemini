/*
 * 17. Leia 80 números e ao final informar quantos número(s) est(á)ão no 
 * intervalo entre 10 (inclusive) e 150 (inclusive);
 */
package com.mycompany.exercicio17;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qtdNumeros = 0;

        System.out.println("Contador: ");
        int i = 1;

        for (; i <= 80; i++) {
            System.out.println("Informe um número: ");
            int numero = input.nextInt();
            if (numero >= 10 && numero <= 150) {
                qtdNumeros = qtdNumeros + 1;
            }
        }
        System.out.println(qtdNumeros + " números estão entre 10 e 150.");
    }
}

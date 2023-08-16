/*
 * 13. Faça um algoritmo que receba um número e mostre uma mensagem 
 * caso este número seja maior que 10;
 */
package com.mycompany.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número: ");
        numero = input.nextInt();

        if (numero > 10) {
            System.out.println("O numero informado é maior que 10");
        } else if (numero == 10) {
            System.out.println("O numero informado é igual a 10");
        } else {
            System.out.println("O numero informado é menor que 10");
        }

        {

        }
    }
}

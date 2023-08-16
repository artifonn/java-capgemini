/*
 * Faça um algoritmo que receba a idade de 75 pessoas e mostre 
 * mensagem informando “maior de idade” e “menor de idade” para cada pessoa. 
 * Considere a idade a partir de 18 anos como maior de idade;
 */
package com.mycompany.exercicio18;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Verifique se o usuario é maior ou menor de idade:");
       
        int i = 1;

        for (; i <= 75; i++) {
             System.out.println("Informe a idade: ");
             int idade = input.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade!");
            } else {
                System.out.println("Menor de idade!");
            }
            System.out.println(" ");
        }

    }
}

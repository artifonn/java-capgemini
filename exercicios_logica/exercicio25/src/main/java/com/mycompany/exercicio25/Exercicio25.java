/*
 * 25. Faça um algoritmo que leia dois números e identifique se 
 * são iguais ou diferentes. Caso eles sejam iguais imprima uma 
 * mensagem dizendo que eles são iguais. Caso sejam diferentes, informe 
 * qual número é o maior, e uma mensagem que são diferentes;
 */
package com.mycompany.exercicio25;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String opcao = "";
            int numero1;
            int numero2;

            while (!opcao.equalsIgnoreCase("sair")) {
                System.out.println("Informe o primeiro numero: ");
                numero1 = input.nextInt();

                System.out.println("Informe o segundo número: ");
                numero2 = input.nextInt();

                if (numero1 == numero2) {
                    System.out.println("Os números informados são iguais!\n");
                } else if (numero1 != numero2) {
                    if (numero1 > numero2) {
                        System.out.println("Os números informados são diferentes!");
                        System.out.println("O número " + numero1 + " é maior que o "
                                + "número " + numero2);
                    } else {
                        System.out.println("O número " + numero2 + " é maior que o"
                                + "numero " + numero1);
                    }
                }
                System.out.println("Digite sair ou precione qualquer tecla"
                        + "para continuar!");
                opcao = input.next();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro" + e.getMessage());
        }
    }
}

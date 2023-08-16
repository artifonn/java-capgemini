/*
 * 24. Faça um algoritmo que receba “N” números e mostre positivo,
 * negativo ou zero para cada número;
 */
package com.mycompany.exercicio24;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String opcao = "";
            int n;

            System.out.println("Classificação Númerica\n");

            while (!opcao.equalsIgnoreCase("sair")) {
                System.out.println("Informe o valor de N: ");
                n = input.nextInt();

                if (n > 0) {
                    System.out.println("O valor de N é positivo\n");
                } else if (n < 0) {
                    System.out.println("O valor de N é negativo\n");
                } else {
                    System.out.println("O valor de N é igual a zero\n");
                }
                System.out.println("Digite sair ou precione qualquer tecla "
                        + "para continuar\n");
                opcao = input.next();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}

/*
 * 23. Faça um algoritmo que receba um número e mostre uma mensagem caso 
 * este número sege maior que 80, menor que 25 ou igual a 40;
 */
package com.mycompany.exercicio23;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String opcao = "";
             
            // O método equalsIgnoreCase ignora a diferença entre as
            // letras maiúsculas e minúsculas
            while (!opcao.equalsIgnoreCase("sair")) {

                System.out.println("Informe um número");
                int numero = input.nextInt();

                if (numero > 80) {
                    System.out.println("O número informado é maior que 80");
                } else if (numero < 25 || numero == 40) {
                    if (numero < 25) {
                        System.out.println("O número é menor que 25");
                    }
                    if (numero == 40) {
                        System.out.println("O número é igual a 40");
                    }
                } else {
                    System.out.println("Tente outra vez!");
                }

                System.out.println("Digite sair ou precione qualquer tecla para"
                        + "continuar");
                opcao = input.next();
            }
            // captura e trata exceções que podem ocorrer durante a execução 
            // do programa
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}

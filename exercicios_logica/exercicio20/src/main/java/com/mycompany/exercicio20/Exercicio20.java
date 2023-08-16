/*
 * 20. A concessionária de veículos “CARANGO VELHO” está vendendo 
 * os seus veículos com desconto. Faça um algoritmo que calcule e 
 * exiba o valor do desconto e o valor a ser pago pelo cliente de vários 
 * carros. O desconto deverá ser calculado de acordo com o ano do veículo. 
 * Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se 
 * deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
 * Informar total de carros com ano até 2000 e total geral;
 */
package com.mycompany.exercicio20;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat fn = new DecimalFormat("#,##0.00");

        int ano;
        double valor;
        char opcao = 'S';

        boolean primeiroLoop = true;

        System.out.println("Concessionária Carango Velho");

        System.out.println("");

        while (opcao != 'N') {
            // Esse trecho do código eu utilizei o chatGPT para me auxiliar
            // com a parte lógica para solucionar o problema de ao iniciar o 
            // programa, a mensgaem "Deseja continuar calculando S/N" era 
            // exibida antes de fornecer as informações do veículo.

            if (!primeiroLoop) {
                System.out.println("");
                System.out.println("Deseja continuar calculando S/N");
                opcao = input.next().charAt(0);
            } else {
                primeiroLoop = false;
            }

            switch (opcao) {
                case 'S':
                    System.out.println("Informe o valor do veículo: ");
                    valor = input.nextDouble();

                    System.out.println("Informe o ano do veículo : ");
                    ano = input.nextInt();

                    if (ano <= 2000) {
                        double calc = valor * 0.88;
                        System.out.println("O valor do veículo é: R$" + fn.format(calc));
                        System.out.println("Você economizou: R$" + fn.format(valor - calc));
                    } else if (ano > 2000) {
                        double calc = valor * 0.93;
                        System.out.println("O valor do veículo é: R$" + fn.format(calc));
                        System.out.println("Voê economizou: R$" + fn.format((valor - calc)));
                    }
                    break;
                case 'N': {
                    System.out.println("A Concessionária Carango Velho "
                            + "agradece a sua preferecia!");
                }
                break;
                default: {
                    System.out.println("Opção inválida");
                }
                break;
            }
        }

    }
}

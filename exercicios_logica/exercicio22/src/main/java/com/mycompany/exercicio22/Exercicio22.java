/*
 * 22. Faça um algoritmo que receba o preço de custo e o preço de venda 
 * de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate 
 * para cada produto. Informe o valor de custo de cada produto, o valor de 
 * venda de cada produto, a média de preço de custo e do preço de venda;
 */
package com.mycompany.exercicio22;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio22 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#,##0.00");

            double custo;
            double venda;
            double totalCusto = 0;
            double totalVenda = 0;

            System.out.println("Calculadora\n");

            for (int i = 0; i < 40; i++) {
                System.out.println("Informe o valor de custo do produto: ");
                custo = input.nextDouble();
                System.out.println("Informe o valor de venda do produto: ");
                venda = input.nextDouble();
                double lucro = venda - custo;

                if (lucro > 0) {
                    System.out.println("Você teve lucro de " + lucro + "\n");
                } else if (lucro < 0) {
                    System.out.println("Houve prejuizo de " + lucro + "\n");
                } else {
                    System.out.println("Houve um empate de " + lucro + "\n");
                }
                totalVenda += venda;
                totalCusto += custo;
            }
            double mediaVenda = totalVenda / 40;
            double mediaCusto = totalCusto / 40;

            System.out.println("A media do preço de venda: " + df.format(mediaVenda) + "\n");
            System.out.println("A media do preço de custo: " + df.format(mediaCusto) + "\n");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}

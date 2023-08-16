/*
 * 11. Faça um algoritmo que receba o preço de custo de um produto e mostre 
 * o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de 
 * acordo com um percentual informado pelo usuário;
 */

package com.mycompany.exercicio11;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        double valorProduto;
        double acrescimo;
        double calc;
        
        System.out.println("Informe o preço de custo do produto escolhido: ");
        valorProduto = input.nextDouble();
        
        System.out.println("Informe o percentual de acréscimo: ");
        acrescimo = input.nextDouble();
        
        calc = (valorProduto * (acrescimo / 100)) + valorProduto;
        
        System.out.println("O valor de venda do produto é " + df.format(calc));
        
    }
}

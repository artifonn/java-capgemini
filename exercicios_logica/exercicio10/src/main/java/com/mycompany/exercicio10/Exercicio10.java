/*
 * 
 * 10. A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações
 * sem juros. Faça um algoritmo que receba um valor de uma compra e 
 * mostre o valor das prestações;
 */
package com.mycompany.exercicio10;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double valorCompra;
        double valorPrestacao;

        System.out.println("Bem-vindo à Loja Mamão com Açucar");

        System.out.println("Informe o valor total da compra: ");
        valorCompra = input.nextDouble();
        
        valorPrestacao = valorCompra / 5;
        
        System.out.println("O valor da prestação é de R$" + df.format(valorPrestacao));
    }
}

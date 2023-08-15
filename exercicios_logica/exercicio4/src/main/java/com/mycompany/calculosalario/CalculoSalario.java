/*
 * 4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e 
 * o total de vendas efetuadas por ele no mês (em dinheiro).
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
 * informar o seu nome, o salário fixo e salário no final do mês;
 */
package com.mycompany.calculosalario;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoSalario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        String nome;
        double salarioFixo;
        double totalDeVendas;
        double calcComicao = 0.15;
        double salarioTotal;
        double comicao;

        System.out.println("Informe o nome do vendedor: ");
        nome = leitor.nextLine();

        System.out.println("Informe o valor do sálario fixo do vendedor " + nome + ": ");
        salarioFixo = leitor.nextDouble();

        System.out.println("Informe o valor total de vendas efetuadas pelo vendedor " + nome + ": ");
        totalDeVendas = leitor.nextDouble();

        comicao = totalDeVendas * calcComicao;

        salarioTotal = comicao + salarioFixo;
        
        System.out.println("O salário fixo do vendedor " + nome + " é de " + "R$" + df.format(salarioFixo));
        System.out.println(nome + " deve receber o salário final no valor total de: " + "R$" + df.format(salarioTotal));

    }
}

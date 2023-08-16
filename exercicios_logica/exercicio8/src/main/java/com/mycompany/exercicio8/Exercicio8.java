/*
 * 8. Elabore um algoritmo que efetue a apresentação do valor da conversão 
 * em real (R$) de um valor lido em dólar (US$). O algoritmo deverá 
 * solicitar o valor da cotação do dólar e também a quantidade de dólares 
 * disponíveis com ousuário;
 */

package com.mycompany.exercicio8;

import java.util.Scanner;

public class Exercicio8 {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float cotacaoDolar, qtdDolar;
        float real;
            
        // Inicio do Programa
        System.out.println("Conversor de Moeda");
        
        // Recebe a quantidade de dólares disponíveis
        System.out.println("Informe a quantidade de dólares para conversão: ");
        qtdDolar = input.nextFloat();
        
        // Recebe o valor da cotação do dólar
        System.out.println("Informe o valor da cotação do dolar: ");
        cotacaoDolar = input.nextFloat();
        
        
        real = (qtdDolar * cotacaoDolar);
        
        System.out.println("O valor convertido é: R$" + real);
        
        
    }
}

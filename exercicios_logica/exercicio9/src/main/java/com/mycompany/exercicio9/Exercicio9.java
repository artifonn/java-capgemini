/*
 * 9. Faça um algoritmo que receba um valor que foi depositado e exiba
 * o valor com rendimento após um mês.Considere fixo o 
 * juro da poupança em 0,07% a. m;
 */

package com.mycompany.exercicio9;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        double deposito;
        double rendimento = 0.07;
        double calc;
        
        System.out.println("Olá, Informe o valor do deposito: ");
        deposito = input.nextDouble();
        
        calc = (deposito * rendimento) + deposito;
        
        System.out.println("O valor é: R$" + df.format(calc));
    }
}

// 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
       int numero1;
       int numero2;
       
       System.out.println("Informe o primeiro número: ");
       numero1 = leitor.nextInt();
       System.out.println("Informe o segundo número: ");
       numero2 = leitor.nextInt();
       
       int result = numero1 + numero2;
       System.out.println("O resultado da soma entre os dois números é:" + result);
    }
}

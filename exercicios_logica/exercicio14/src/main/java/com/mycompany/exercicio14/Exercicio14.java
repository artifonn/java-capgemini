/*
 * 14. Escreva um algoritmo que leia dois valores inteiro distintos 
 * e informe qual é o maior;
 */

package com.mycompany.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        int numero1 = input.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int numero2 = input.nextInt();
        
        if(numero1 > numero2) {
            System.out.print("O valor do primeiro número é maior que o segudo!");
        } else {
            System.out.print("O valor do segundo número é maior que o primeiro");
        }
    }
}

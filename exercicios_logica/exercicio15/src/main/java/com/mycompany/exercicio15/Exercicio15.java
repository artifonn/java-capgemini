/*
 * 15. Faça um algoritmo que receba um número e diga se 
 * este número está no intervalo entre 100 e 200;
 */

package com.mycompany.exercicio15;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número");
        int numero = input.nextInt();
        
        if(numero >= 100 && numero <= 200) {
            System.out.println("Este número está no intervalo entre 100 e 200");
        } else {
            System.out.println("Este numero está fora do intervalo entre 100 e 200");
        }
    }
}

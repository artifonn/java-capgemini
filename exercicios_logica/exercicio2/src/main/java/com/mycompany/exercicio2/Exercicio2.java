/*
 * 2. Faça um algoritmo que receba dois números e ao final mostre a soma, 
* subtração, multiplicação e a divisão dos dois números lidos;
 */
package com.mycompany.exercicio2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;

        System.out.println("Informe o primeiro numero: ");
        numero1 = leitor.nextInt();

        System.out.println("Informe o segundo numero: ");
        numero2 = leitor.nextInt();

        double calcSoma = numero1 + numero2;
        double calcSub = numero1 - numero2;
        double calcMult = numero1 * numero2;
        double calcDiv = numero1 / numero2;

        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("A soma entre os dois valores é: " + df.format(calcSoma));
        System.out.println("A subtração entre os dois números é: " + df.format(calcSub));
        System.out.println("A multiplicação dos dois números é: " + df.format(calcMult));
        System.out.println("A divisão entre os dois números é: " + df.format(calcDiv));

    }
}

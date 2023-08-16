/*
 * 7. Leia uma temperatura em graus Celsius e apresentá-la convertida 
 * em graus Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, 
 * sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
 */
package com.mycompany.exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Inicializa as variaveis
        double C, F;

        System.out.println("Conversor de temperatura");

        System.out.println("Informe a temperatura em grau Celsius: ");
        C = input.nextDouble();

        F = (9 * C + 160) / 5;

        System.out.println(
                "A temperatura de grau Celsius convertida em Fahrenheit é: ºF "
                + F);

    }
}

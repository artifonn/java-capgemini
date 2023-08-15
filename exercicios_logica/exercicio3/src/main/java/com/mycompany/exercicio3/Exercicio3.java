/*
 * 3. Escreva um algoritmo para determinar o consumo médio de um automóvel 
 * sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;
 */
package com.mycompany.exercicio3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double distanciaPercorrida;
        double combustivelTotalutilizado;

        System.out.println("Informe a distancia percorrida em km: ");
        distanciaPercorrida = leitor.nextDouble();

        System.out.println("Informe a quantidade total de combustivel utilizado: ");
        combustivelTotalutilizado = leitor.nextDouble();

        double result = distanciaPercorrida / combustivelTotalutilizado;

        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("O consumo médio do seu automóvel é: " + df.format(result) + "km/L");
    }
}

/*
 * 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica
 * mais o percentual do distribuidor e dos impostos aplicados 
 * (primeiro os impostos são aplicados sobre o custo de fábrica, e depois 
 * o percentual do distribuidor sobre o resultado). Supondo que o 
 * percentual do distribuidor seja de 28% e os impostos 45%, escreva 
 * um algoritmo que leia o custo de fábrica de um carro e informe 
 * o custo ao consumidor do mesmo;
 */

package com.mycompany.exercicio12;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        double custoFabrica;
        double imposto = 0.45;
        double impDistribuidor = 0.28;
        
        double calcDist;
        double calcFab;
        
        System.out.println("Informe o custo de fábrica para um carro: ");
        custoFabrica = input.nextDouble();
        
        calcFab = (imposto * custoFabrica) + custoFabrica;
        calcDist = (impDistribuidor * calcFab) + calcFab;
        
        
        System.out.println("O custo de fábrica é: " + df.format(calcFab));
        System.out.println("O custo total do veículo é: " + df.format(calcDist));
    }
}

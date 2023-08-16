/*
 * 21. Escreva um algoritmo que leia os dados de “N” pessoas 
 * (nome, sexo, idade e saúde) e informe se está apta ou não para 
 * cumprir o serviço militar obrigatório. Informe os totais;
 */
package com.mycompany.exercicio21;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int qtdPessoas = 0;
        int totalAptos = 0;
        int totalInaptos = 0;
     
        System.out.println("Alistamento Militar\n");

        System.out.println("Informe a quantidade de pessoas a serem analisadas: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Informe o nome da pessoa: ");
            String nome = input.next();

            System.out.println("Informe o sexo da pessoa M/F: ");
            String sexo = input.next();

            System.out.println("Informe a idade da pessoa: ");
            int idade = input.nextInt();

            System.out.println("Informe o estado de saúde da pessoa Boa/Ruim: ");
            String saude = input.next();

            if (sexo.equalsIgnoreCase("M") && idade >= 18 && idade <= 45 && saude.equalsIgnoreCase("boa")) {
                totalAptos++;
            } else {
                totalInaptos++;
            }
            qtdPessoas++;
        }
        System.out.println("O total de pessoas é: " + qtdPessoas);
        System.out.println("Total de pessaos apta: " + totalAptos);
        System.out.println("Total de pessoas inaptas: " + totalInaptos);
    }
}


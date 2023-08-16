/*
 * 16. Escreva um algoritmo que leia o nome e as três notas 
 * obtidas por um aluno durante o semestre. Calcular a sua média 
 * (aritmética), informar o nome e sua menção aprovado (media >= 7), 
 * Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
 */
package com.mycompany.exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int aprovado = 7;
        int reprovado = 5;
        
        System.out.println("Informe o seu nome");
        String nome = input.nextLine();

        System.out.println("Informe a primeira nota");
        double nota1 = input.nextDouble();

        System.out.println("Informe a segunda nota");
        double nota2 = input.nextDouble();

        System.out.println("Informe a terceira nota");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= aprovado) {
            System.out.println(nome + " você está aprovado!");
        } else if (media < reprovado) {
            System.out.println(nome + " você está reprovado!");
        } else if (media >= 5.1 || media <= 6.9) {
            System.out.println(nome + " você está em recuperação");
        }
    }
}

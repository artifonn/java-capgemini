/*
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe 
 * o nome e se ela é homem ou mulher. No final informe total de homens 
 * e de mulheres;
 */
package com.mycompany.exercicio19;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        char sexo;
        int masculino = 0;
        int feminino = 0;

        System.out.println("Classificação");

        System.out.println("");

        for (int i = 1; i <= 56; i++) {
            System.out.println("Informe um nome: ");
            nome = input.nextLine();
            System.out.println("Informe o Sexo (M ou F ): ");
            sexo = input.next().charAt(0);
            if (sexo == 'm' || sexo == 'M') {
                System.out.println(nome + " é do sexo Masculino");
                masculino = masculino + 1;
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println(nome + " é do sexo Feminino");
                feminino = feminino + 1;
            } else {
                System.out.println("valor inválido! ");
                i--; // em caso de erro faz o loop execultar a mesma iteração
            }
            input.nextLine(); // Obs: Se eu estiver 
            // lendo uma entrada do usuário com Scanner.nextLine() e, 
            // em seguida, tentar ler a próxima entrada com Scanner.next() 
            // ou Scanner.nextInt(), o caractere de nova linha deixado no 
            // buffer será lido como a entrada para esses métodos, 
            // em vez da entrada do usuário. Isso pode causar 
            // resultados inesperados em sua aplicação.
        }
        System.out.println("O total de Homens é " + 
                masculino + " e o total de mulheres é " + feminino);
    }
}

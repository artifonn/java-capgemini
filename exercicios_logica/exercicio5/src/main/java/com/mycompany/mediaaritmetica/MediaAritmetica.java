/*
 * Escreva um algoritmo que leia o nome de um aluno e
 * as notas das três provas que ele obteve no semestre. 
 * No final informar o nome do aluno e a sua média (aritmética);
 */

package com.mycompany.mediaaritmetica;

import java.util.Scanner;

public class MediaAritmetica {
    
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        
        String nome;
        double nota1, nota2, nota3, calcMedia;
        
        // Lê o nome do aluno
        System.out.println("Informe o nome do aluno: ");
        nome = leitura.nextLine();
        
        // Lê a nota das três provas
        System.out.println("Informe a primeira prova: ");
        nota1 = leitura.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        nota2 = leitura.nextDouble();
        
        System.out.println("Informe a terceira nota: ");
        nota3 = leitura.nextDouble();
        
        // calcula a média aritmetica das notas
        calcMedia = (nota1 + nota2 + nota3) / 3;
        
        // preciso pesquisar mais sobre essa formatação
        System.out.printf("Olá %s, a sua média é %.2f\n", nome, calcMedia);
    }
}

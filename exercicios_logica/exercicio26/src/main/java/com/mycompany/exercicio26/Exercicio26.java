/*
 * 26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
 * Caso o usuário digite um número que não esteja neste intervalo, exibir a 
 * seguinte mensagem: número inválido;
 */
package com.mycompany.exercicio26;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int numero;
            
            System.out.println("Informe um número da 1 até 5: ");
            numero = input.nextInt();
            
            switch (numero) {
                case 1:
                    System.out.println("Um");
                    break;
                case 2:
                    System.out.println("Dois");
                    break;
                case 3:
                    System.out.println("Três");
                    break;
                case 4:
                    System.out.println("Quatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                default:
                    System.out.println("Número Inválido");
                    break;
            }
            input.close();
        } catch ( Exception e) {
            System.out.println("Erro inesperado " + e.getMessage());
        }

    }
}

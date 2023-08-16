/*
 * 6. Leia dois valores para as variáveis A e B, 
 * e efetuar as trocas dos valores de forma que a variável A passe 
 * a possuir ovalor da variável B e a variável B passe a possuir o 
 * valor da variável A. Apresentar osvalores trocados;
 */

package com.mycompany.trocadevalores;

import java.util.Scanner;

public class TrocaDeValores {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        int A, B, suporteTemporario;
        
        // Recebe o valor de A
        System.out.println("Informe o valor de A: ");
        A = input.nextInt();
        
        // Recebe o valor de B
        System.out.println("Informe o valor de B: ");
        B = input.nextInt();
        
        // Efetua a troca de valores
        suporteTemporario = A;
        A = B;
        B = suporteTemporario;
        
        System.out.println("A recebeu o valor de B: " + B);
        System.out.println("B recebeu o valode A: " + A);
        
    }
}

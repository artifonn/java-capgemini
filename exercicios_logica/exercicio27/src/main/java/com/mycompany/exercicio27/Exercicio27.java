/*
* 27. A concessionária de veículos “CARANGO” está vendendo os seus 
* veículos com desconto. Faça um algoritmo que calcule e exiba o valor 
* do desconto e o valor a ser pago pelo cliente. 
* O desconto deverá ser calculado sobre o valor do veículo de acordo
* com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). 
* Com valor do veículo zero encerra entrada de dados. Informe total 
* de desconto e total pago pelos clientes;
 */
package com.mycompany.exercicio27;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio27 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#,##0.00");
            
            System.out.println("Concessionária CARANGO");
            
            String combustivel;
            int valorCar;
            double calc;
            
            while (true) {
                System.out.println("Para encerrar digite 0 \n");
                
                System.out.println("Informe o valor do carro: ");
                valorCar = input.nextInt();
                
                if (valorCar == 0) {
                    System.out.println("A Carangos agradece a sua preferência!");
                    break;
                }
                
                input.nextLine();
                
                System.out.println("Opções de combustivel(Álcool, Gasolina, Diesel): ");
                combustivel = input.nextLine();
                if ("Diesel".equals(combustivel)) {
                    calc = valorCar - (valorCar * 0.86);
                    System.out.println("Essa opção está com um desconto de R$: " + df.format(calc));
                    System.out.println("O valor do veículo é R$: " + df.format((valorCar - calc)));
                } else if ("Álcool".equalsIgnoreCase(combustivel)) {
                    calc = valorCar - (valorCar * 0.75);
                    System.out.println("Essa opção está com um desconto de R$: " + calc);
                    System.out.println("O valor do veículo é R$: " + df.format((valorCar - calc)));
                } else if ("Gasolina".equalsIgnoreCase(combustivel)) {
                    calc = valorCar - (valorCar * 0.79);
                    System.out.println("Essa opção está com um desconto de R$: " + df.format(calc));
                    System.out.println("O valor do veículo é R$: " + (df.format(valorCar - calc)));
                } else {
                    System.out.println("A CARANGO agradece a sua preferencia");
                }
            }
        } catch (Exception e){
            System.out.println("Erro inesperado " + e.getMessage());
        
    }
    }
}

package atividade1;

import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {
        
     //1. Escreva um programa que leia um número e escreva 
     //na tela se o número é menor, igual ou maior que zero.
     
     System.out.println("Digite um numero: ");
     Scanner entrada = new Scanner(System.in);

     int numero = entrada.nextInt();

     if(numero > 0){
        System.out.println("O número "+ numero + " é maior que 0 ");
     }else if(numero < 0){
        System.out.println("O número " + numero + " é menor que 0 ");
        }else if(numero == 0){
            System.out.println("numero digitado é igual a 0");
        }

        entrada.close();
     


    }
    
}

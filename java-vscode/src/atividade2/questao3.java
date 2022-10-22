package atividade2;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        //3. Escreva um programa que vai ler 2 números, o sistema vai escrever na 
        //tela todos os número entre os 2 digitados.

        Scanner entrada = new Scanner(System.in);
        System.out.println("digitar um número: ");
        int n1 = entrada.nextInt();
        System.out.println("digitar um número: ");
        int n2 = entrada.nextInt();
        System.out.println("--------------");

        if(n1 < n2){
      for(int i = n1+1; i < n2; i++ ){
        System.out.println();
        System.out.println(i);
      }
    }else if(n2 < n1){
        for(int i = n1-1; i > n2; i-- ){
            System.out.println();
            System.out.println(i);
          }
          
    }

    }
}

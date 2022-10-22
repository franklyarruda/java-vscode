package atividade2;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        
        //1. Escreva um programa que vai ler um número, o sistema vai escrever na 
        //tela a tabuada de 1 até 10 do número digitado.
        
        Scanner entrada = new Scanner(System.in);
        System.out.println(" digitar um numero ");
        int numero = entrada.nextInt();
        System.out.println("tabuada do numero: " + numero);
        System.out.println("qual operação? ");
        String operacao = entrada.next();
        for(int i = 1; i <= 10; i++ ){

            if(operacao.equals("+")){
                System.out.print(i +"+"+ numero + "=" );
            System.out.println(i + numero);
            }
            if(operacao.equals("-")){
                System.out.print(i +"-"+ numero + "=" );
            System.out.println(i - numero);
            }
            if(operacao.equals("*")){
                System.out.print(i +"*"+ numero + "=" );
            System.out.println(i * numero);
            }
            if(operacao.equals("/")){
                System.out.print(i +"/"+ numero + "=" );
            System.out.println(i / numero);
            }
        }
        entrada.close();

    }
    
}

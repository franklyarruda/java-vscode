package atividade2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        //2. Escreva um programa que vai ler uma mensagem e um número, 
        //o sistema vai repetir a mensagem digitada x vezes o número digitado.

        Scanner entrada = new Scanner(System.in);
        System.out.println(" digitar a mensagem: ");
        String mensagem = entrada.nextLine();
        System.out.println("quantas vezes repetir a mensagem? ");
        int repetir = entrada.nextInt();

        for(int i = 0; i < repetir ; i++ ){
            System.out.println(mensagem);
        }

    }
}

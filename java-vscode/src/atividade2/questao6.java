package atividade2;

import java.util.Scanner;

public class questao6 {

    public static void main(String[] args) {

        // 6. Escreva um programa que vai ler 5 números o sistema vai
        // mostrar o maior o menor a soma e a média dos números digitados.

        int maior = 0;
        int menor = 0;
        int soma = 0;
        int media = 0;
        

        for (int i = 0; i < 5; i++) {

            System.out.println("digitar um numero: ");
            Scanner entrada = new Scanner(System.in);
            int n1 = entrada.nextInt();

            if (n1 > maior) {
                maior = n1;
                menor = n1;
                System.out.println("maior " + maior);
                
            }
            if (n1 < menor) {
                menor = n1;
                System.out.println("menor " + menor);
            }
            soma = soma + n1;
            media = (soma / 5);

        }
        System.out.println();
        System.out.println("maior " + maior);
        System.out.println("menor " + menor);
        System.out.println("soma dos numeros " + soma);
        System.out.println("media: " + media);

    }
}

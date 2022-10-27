package atividade2;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        // 5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai
        // mostrar
        // quantas são maior ou iguais a 18 e quantas são de menor.

        int maior = 0;
        int menor = 0;
        int igual = 0;

        for (int i = 1; i < 5; i++) {
            System.out.println(" digitar a idade da pessoa ");
            Scanner entrada = new Scanner(System.in);
            int idade = entrada.nextInt();

            if (idade >= 18) {
                maior ++;

            }
            if (idade < 18) {
                menor++;
            }
            if (idade == 18) {
                igual++;
            }

            System.out.println("são " + maior + " de maior e " + menor + " de menor " + igual + " igual a 18");

        }
        
    }
}

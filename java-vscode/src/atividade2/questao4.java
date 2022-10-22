package atividade2;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        //4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" 
        //se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.

        System.out.println(" digite Java-2022 terá 5 tentativas ");
        for(int i = 5; i > 0; i--){
        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.nextLine();
        if(i==1){
            System.out.println("acabou as tentativas");
        }
        if(palavra.equals("Java-2022")){
            System.out.println(" Resposta correta ");
        }if(!palavra.equals("Java-2022")){
            System.out.println("resposta errada voce tem " + (i-1) + " tentativas");
        }
        entrada.close();
    }
    
    }
}

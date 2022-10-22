package atividade2;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        //5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai mostrar 
        //quantas são maior ou iguais a 18 e quantas são de menor.

        int maior = 0;
        int menor = 0;
        
        for(int i = 0; i < 5; i++){
            System.out.println(" digitar a idade da pessoa ");
            Scanner entrada = new Scanner(System.in);
            int idade = entrada.nextInt();
        if(idade > 18 ){
             maior = maior + 1;
           
            
        }else{
             menor= menor + 1;
        }
        entrada.close();
    }
    
    System.out.println("são " + maior + " de maior e " + menor + " de menor" );
    

    }
    
}

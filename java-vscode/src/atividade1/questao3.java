package atividade1;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        
        //3. Escreva um programa que solicita a 
        //idade de uma pessoa e verifica se ela pode votar (idade>=16).

        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();
        if (idade >= 16){
            System.out.println("pode votar");
        }else{
            System.out.println(" não pode votar ");
        }
    }
entrada.close();
    }
}

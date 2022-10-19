package atividade1;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {

        //4. Escreva um programa que solicita a 
        //idade de uma pessoa e verifica se ela pode dirigir (idade>=18).

        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();
        if (idade >= 18){
            System.out.println("pode dirigir");
        }else{
            System.out.println(" não pode dirigir ");
        }
    }
entrada.close();
        
    }
}

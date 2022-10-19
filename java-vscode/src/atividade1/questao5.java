package atividade1;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        
        //5. Escreva um programa que dada a idade de uma pessoa, retorna uma das seguintes mensagens: “Não pode nem votar e nem dirigir”, 
        //“Pode votar, mas não pode dirigir”, “Pode votar e pode dirigir”.

        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();
        System.out.println("possui CNH? sim ou não");
        String cnh = entrada.next();
        if ((idade >= 18) && (cnh.equals("sim"))){
            System.out.println("pode dirigir e votar");
        }else if((idade >= 16) && (cnh.equals("não"))){
            System.out.println(" pode votar mas não pode dirigir ");
        }else if((idade < 16) &&(cnh.equals("não"))){
            System.out.println("não pode nem votar nem dirigir ");
        }
    }
entrada.close();
        
    }
}

package atividade1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {

        // 2. Escreva um programa que receba três inteiros e diga qual deles é o maior e
        // qual o menor.

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite 1 numero: ");
        int numero1 = entrada.nextInt();
        System.out.println(" Digite mais um número: ");
        int numero2 = entrada.nextInt();
        System.out.println(" Digite mais um número: ");
        int numero3 = entrada.nextInt();

        int numeroMaior = 0;
        int numeroMenor = 0;

        if ((numero1 >= numero2) && (numero1 >= numero3)) {
            numeroMaior = numero1;
        }
        if ((numero1 <= numero2) && (numero1 <= numero3)) {
            numeroMenor = numero1;
            

        }  if ((numero2 >= numero1) && (numero2 >= numero3)) {
            numeroMaior = numero2;
        }
        if ((numero2 <= numero1) && (numero2 <= numero3)) {
            numeroMenor = numero2;
           

        }  if ((numero3 >= numero1) && (numero3 >= numero2)) {
            numeroMaior = numero3;
        }
            if((numero3 <= numero1) && (numero3 <= numero2)){
                numeroMenor = numero3;
            }
            System.out.println("O número " + numeroMaior + " é maior e o numero " + numeroMenor + " e o menor ");
            entrada.close();
        }
    
        
    }



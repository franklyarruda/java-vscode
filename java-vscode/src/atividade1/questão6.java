package atividade1;

import java.util.Scanner;

public class questão6 {
    public static void main(String[] args) {
    //     6. Escreva um programa para calcular O IMC (índice de massa corpórea) que indica o grau de obesidade de uma pessoa.
    // Este índice é obtido pelo peso (em kg) dividido pelo quadrado da altura (em metros).
    // Entradas peso e altura, saída resultado do IMC e Avaliação.
    // A tabela a seguir apresenta as faixas deste índice:
    // IMC = Avaliação
    // menor que 20 = Abaixo do normal
    // entre 20, 25 = Normal
    // entre 25, 30 = Sobrepeso
    // entre 30, 35 = Obesidade leve
    // entre 35, 40 = Obesidade moderada
    // maior que 40 = Obesidade mórbida

        Scanner entrada = new Scanner(System.in);

    System.out.println("Digite seu peso: ");
    double peso = entrada.nextDouble();
    System.out.println("Digite sua Altura: ");
    double altura = entrada.nextDouble();

    double imc = peso/(altura * 2);

        if(imc < 20){
            System.out.println("abaixo do normal "+ imc );
        }if((imc >= 20) && (imc < 25)){
            System.out.println(" normal "+ imc );
        }if((imc >= 25) && (imc < 30)){
            System.out.println(" sobrepeso "+ imc );
        }if((imc >= 30) && (imc < 35)){
            System.out.println(" Obesidade Leve "+ imc );
        }if((imc >= 35) && (imc <= 40)){
            System.out.println(" Obesidade Moderada "+ imc );
        }if(imc > 40){
            System.out.println(" Obesidade Morbida "+ imc );
        }
    }
}

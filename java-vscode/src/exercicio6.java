import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        //6. Escreva um programa para ler o valor de uma conta e quantas pessoas 
        //vão dividir a conta, o sistema vai apresentar quanto cada pessoa vai pagar.
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor da conta ");
        double valor = entrada.nextDouble();
        System.out.println("vai ser dividido por quantas pessoas? ");
        int pessoas = entrada.nextInt();
        double divisao = (valor / pessoas);
        System.out.printf("vai sair %s", divisao +"RS$ para cada um ");
        entrada.close();
    }
}

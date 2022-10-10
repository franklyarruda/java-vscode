import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite outro numero ");
        int numero2 = entrada.nextInt();
        
        int soma = numero1 + numero2;

        System.out.println("A soma dos números é " + soma);

        entrada.close();
    }
}

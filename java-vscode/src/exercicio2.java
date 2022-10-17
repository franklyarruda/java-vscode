import java.util.Scanner;

public class exercicio2 {
    
//2. Escreva um programa para ler um número e o sistema vai 
//    mostra os números vizinhos, o anterior e o próximo número.

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int numero = entrada.nextInt();
    
    System.out.println("numero anterior " + (numero = numero - 1));

    System.out.println("numero atual" + (numero = numero + 1 ));

    System.out.println("proximo numero " + (numero = numero + 2));

}


}

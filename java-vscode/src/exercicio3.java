import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
//3. Escreva um programa para ler um nome digitado e mostrar a mensagem "Olá <nome-digitado>".

Scanner entrada = new Scanner(System.in);
System.out.println("qual seu nome ");
String nome = entrada.nextLine();

System.out.println("Olá " + nome);
entrada.close();
    }
}

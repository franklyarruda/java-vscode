import java.util.Scanner;

public class exercicio4 {

    //4. Escreva um programa para ler o nome, valor da hora, quantas horas trabalhadas, o sistema vai apresentar o salário.
//<fulano> vai receber R$<00.00>

public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    String nome = entrada.nextLine();
    double vHora = entrada.nextDouble();
    int hTrabalhada = entrada.nextInt();

    System.out.printf("O %s cobra o valor da hora é %s e trabalhou %s \n", nome, vHora, hTrabalhada);

    double total = hTrabalhada * vHora;
    System.out.println( nome + " vai receber: R$<"+ total +">");
entrada.close();

}
    
}

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        
        //5. Escreva um programa para ler o valor de um jantar, o sistema vai apresentar a taxa do garçom 10% e também o valor
        //<valor refeição> + 10% = <final total>.

        Scanner entrada = new Scanner(System.in);

        System.out.println("valor do jantar: ");

        double vJantar = entrada.nextDouble();
        double porcentagem = ((0.1)*vJantar);

        System.out.println("valor do jantar sai por " + vJantar + " com os 10% sai por " + (porcentagem + vJantar) );
        entrada.close();
    }
}

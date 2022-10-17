import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

      //  1. Escreva um programa para ler 2 notas, o sistema vai apresentar a média final, 
        //se nota maior que 7 incluir mensagem "aprovado" senão "reprovado".
        
        Scanner entrada = new Scanner(System.in);

        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double media = nota1 + nota2 /2;
        if(media >= 7){
            System.out.println("aluno aprovado ");
        }else{
            System.out.println("aluno reprovado ");
        }
        entrada.close();
    }
    
}

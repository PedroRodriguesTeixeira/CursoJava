package CursoJava.estruturaSequencial.exerciciosEstruturaSequencial;
import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/



public class soma {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("=== ALGORITMO DA SOMA ===");
        System.out.print("Digite o primeiro digito da soma:");
        int item1 = sc.nextInt();
        System.out.print("Digite o segundo digito da soma:");
        int item2 = sc.nextInt();
        int soma = item1 + item2;

        System.out.printf("SOMA = %d", soma);



        sc.close();


    }

}

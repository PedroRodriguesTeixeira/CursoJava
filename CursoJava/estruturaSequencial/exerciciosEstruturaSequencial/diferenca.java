package CursoJava.estruturaSequencial.exerciciosEstruturaSequencial;
import java.util.Scanner;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

public class diferenca {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int diferenca;

        System.out.println("Digite 4 valores inteiros abaixo:");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.println("A diferenca e' = " + diferenca);

        entrada.close();

    }

}

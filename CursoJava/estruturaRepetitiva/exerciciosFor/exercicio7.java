package CursoJava.estruturaRepetitiva.exerciciosFor;

import java.util.Scanner;

public class exercicio7 {

    /*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int N, quadrado, cubo;

        System.out.print("Digite um valor: ");
        N = entrada.nextInt();

        for (int i = 1; i<=N; i++){
            quadrado = i * i;
            cubo = i * i * i;
            System.out.printf("%d ", i);
            System.out.printf("%d ", quadrado);
            System.out.printf("%d ", cubo);
            System.out.println();
        }

        entrada.close();

    }
}

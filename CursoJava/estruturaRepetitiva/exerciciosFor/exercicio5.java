package CursoJava.estruturaRepetitiva.exerciciosFor;

import java.util.Scanner;

public class exercicio5 {

    /*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int N, fatorial = 1;

        System.out.println("\nFatorial\n");
        System.out.print("Digite um valor inteiro para receber seu fatorial: ");
        N = entrada.nextInt();

        fatorial = N;

        if(N!=0){
            for(int i = 1; i<N; i++){
                fatorial *= (N-i);
            }
        } else fatorial = 1;

        System.out.println(fatorial);

        entrada.close();

    }
}

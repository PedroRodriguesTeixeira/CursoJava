package CursoJava.estruturaRepetitiva.exerciciosFor;

import java.util.Scanner;

public class exercicio2 {

    /*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)*/

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int N, x, in = 0, out = 0;

        System.out.println("\nNumeros dentro do intervalo [10,20]\n");
        System.out.print("Quantos numeros voce deseja adicionar? ");
        N = entrada.nextInt();

        System.out.println("Digite seus numeros:");
        for(int i = 0; i<N; i++){
            x = entrada.nextInt();
            if (x>= 10 && x<=20){
                ++in;
            } else ++out;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        entrada.close();

    }

}

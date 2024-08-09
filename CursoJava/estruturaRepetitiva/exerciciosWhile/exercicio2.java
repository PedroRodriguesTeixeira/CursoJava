package CursoJava.estruturaRepetitiva.exerciciosWhile;

import java.util.Scanner;

public class exercicio2 {

    /*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite dois numeros para voce saber seu quadrante: ");
        int x = 1, y = 1;
        while(x != 0 || y != 0){
            x = entrada.nextInt();
            y = entrada.nextInt();
            if(x > 0 && y > 0){
                System.out.println("primeiro\n");
            } else if (x < 0 && y > 0){
                System.out.println("segundo\n");
            } else if(x < 0 && y < 0){
                System.out.println("terceiro\n");
            } else if(x > 0 && y < 0) System.out.println("quarto\n");
        }

        entrada.close();

    }
}

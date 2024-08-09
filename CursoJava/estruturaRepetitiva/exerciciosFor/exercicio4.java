package CursoJava.estruturaRepetitiva.exerciciosFor;

import java.util.Scanner;

public class exercicio4 {

    /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int N, x, y;

        System.out.print("Digite quantos vezes voce quer rodar o programa: ");
        N = entrada.nextInt();

        for (int i = 0; i<N; i++){
            System.out.print("Digite dois pares de numeros para sua divisao: ");
            x = entrada.nextInt();
            y = entrada.nextInt();
            if(y == 0){
                System.out.println("Impossivel a divisao!");
            } else{
                double divisao = (double) x / y;
                System.out.printf("%.1f\n", divisao);
            }
        }

        entrada.close();


    }

}

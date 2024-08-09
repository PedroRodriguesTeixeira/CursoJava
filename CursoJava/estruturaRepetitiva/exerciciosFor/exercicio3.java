package CursoJava.estruturaRepetitiva.exerciciosFor;

import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {

    /*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

    public static void main (String[] args){

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        int N;
        double casoTeste1, casoTeste2, casoTeste3, mediaPonderada;

        System.out.println("\nMedia ponderada de testes\n");
        System.out.print("Quantos casos voce deseja? ");
        N = entrada.nextInt();

        for (int i = 0; i<N; i++){
            System.out.print("Digite seus 3 casos: ");
           casoTeste1 = entrada.nextFloat();
           casoTeste2 = entrada.nextFloat();
           casoTeste3 = entrada.nextFloat();
            mediaPonderada = (casoTeste1 * 2.0 + casoTeste2 * 3.0 + casoTeste3 * 5.0) / 10.0;
            System.out.printf("%.1f\n", mediaPonderada);
        }



        entrada.close();

    }
}

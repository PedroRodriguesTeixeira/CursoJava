package CursoJava.estruturaRepetitiva.exerciciosFor;
import java.util.Scanner;

public class exercicio6 {

    /*Ler um número inteiro N e calcular todos os seus divisores*/

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int N;

        System.out.println("Digite um numero para calcular todos os seus divisores: ");
        N = entrada.nextInt();

        for (int i = 1; i<=N; i++){
           if(N%i==0){
               System.out.println(i);
           }
        }

        entrada.close();


    }
}

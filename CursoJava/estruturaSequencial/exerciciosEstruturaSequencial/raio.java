package CursoJava.estruturaSequencial.exerciciosEstruturaSequencial;
import java.util.Scanner;
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/



public class raio {

    public static void main(String[] args){


        Scanner entrada = new Scanner (System.in);

        double pi = 3.14159, calculo = 0;

        System.out.print("Digite o valor do raio:");
        double raio = entrada.nextDouble();


        calculo = pi * Math.pow(raio, 2);


        System.out.printf("O valor da area do circulo e' = %.4f", calculo);

        entrada.close();



    }
}

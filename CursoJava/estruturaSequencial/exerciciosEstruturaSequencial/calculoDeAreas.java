package CursoJava.exerciciosEstruturaSequencial;
import java.util.Scanner;

public class calculoDeAreas {

    public static void main (String[] args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculador de areas:\n");

        System.out.print("Digite o tamanho do ponto A: ");
        double a = entrada.nextDouble();
        System.out.print("Digite o tamanho do ponto B: ");
        double b = entrada.nextDouble();
        System.out.print("Digite o tamanho do ponto C: ");
        double c = entrada.nextDouble();

        System.out.println();
        double calculo;

        calculo = a * c / 2;
        System.out.printf("TRIANGULO RETANGULO(a = base e c = altura): %.3f", calculo);
        System.out.println();
        calculo = 3.14159 * Math.pow(c, 2);
        System.out.printf("CIRCULO(c = raio): %.3f", calculo);
        System.out.println();
        calculo = (a + b) * c / 2;
        System.out.printf("TRAPEZIO(c = h): %.3f", calculo);
        System.out.println();
        calculo = Math.pow(b, 2);
        System.out.printf("QUADRADO (b = lado): %.3f", calculo);
        System.out.println();
        calculo = a * b;
        System.out.printf("RETANGULO: %.3f", calculo);


        entrada.close();

    }

}

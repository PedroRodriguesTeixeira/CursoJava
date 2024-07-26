package CursoJava.estruturaSequencial;
import java.util.Scanner;

public class entradaDeDados1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        System.out.print("Enter com seu nome:");
        x = sc.next(); //é o comando de entrada de dados
        System.out.print("Qualquer numero inteiro:");
        y = sc.nextInt();
        System.out.print("Entre com qualquer numero real (utilize ',' ao inves de '.'):");
        z = sc.nextDouble();
        System.out.println("Voce digitou: "  + x);
        System.out.println("Voce digitou: "  + y);
        System.out.println("Voce digitou: "  + z); //println pega a localidade independente, ou seja, ele vai pegar o ponto "."
        System.out.printf("Voce digitou %f", z);
        sc.close();

    }


}

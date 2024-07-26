package CursoJava.estruturaCondicional.exercicios;
import java.util.Scanner;

public class exercicioCondicional3 {

        public static void main(String[] args) {
            System.out.print("\nDETECTOR DE NUMEROS MULTIPLOS\n");

            Scanner entrada = new Scanner(System.in);
            System.out.print("DIGITE O NUMERO 1: ");
            int a = entrada.nextInt();

            System.out.print("DIGITE O NUMERO 2: ");
            int b = entrada.nextInt();

            if (a % b == 0 || b % a == 0) {
                System.out.println("SAO MULTIPLOS\n");
            } else {
                System.out.println("NAO SAO MULTIPLOS!\n");
            }

            entrada.close();
        }
}



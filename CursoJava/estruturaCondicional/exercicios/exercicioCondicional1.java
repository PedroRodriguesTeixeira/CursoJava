package CursoJava.estruturaCondicional.exercicios;
import java.util.Scanner;

public class exercicioCondicional1 {
        public static void main(String[] args) {

            System.out.print("\nDETECTOR DE NUMEROS\n");

            Scanner entrada = new Scanner(System.in);
            System.out.print("DIGITE O NUMERO:");
            int numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("NEGATIVO!\n");
            } else {
                System.out.println("NAO NEGATIVO!\n");
            }

            entrada.close();
        }
}




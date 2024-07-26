package CursoJava.estruturaCondicional.exercicios;
import java.util.Scanner;
public class exercicioCondicional2 {

        public static void main(String[] args) {
            System.out.print("\nDETECTOR DE NUMEROS PARES/IMPARES\n");

            Scanner entrada = new Scanner(System.in);
            System.out.print("DIGITE O NUMERO: ");
            int detector = entrada.nextInt();

            if (detector % 2 == 0) {
                System.out.println("PAR!\n");
            } else {
                System.out.println("IMPAR!\n");
            }

            entrada.close();
        }
}



package CursoJava.estruturaCondicional;
import java.util.Scanner;


public class sintaxeOpcional {
        public static void main(String[] args) {
            int calculo;

            System.out.print("\nOPERADORA\n");

            Scanner entrada = new Scanner(System.in);

            System.out.print("DIGITE OS MINUTOS UTILIZADOS: ");
            int minutos = entrada.nextInt();
            double conta = 50.0;

            if (minutos <= 100) {
                System.out.println("Sua conta deu R$ " + conta);
            } else {
                calculo = minutos - 100; // Corrigido para calcular os minutos excedentes
                conta += calculo * 2;

                System.out.println("Sua conta deu R$ " + conta);
            }

            entrada.close();
        }
    }


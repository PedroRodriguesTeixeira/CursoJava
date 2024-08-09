package CursoJava.estruturaRepetitiva;
import java.util.Scanner;

public class estruturaEnquanto {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite um numero: ");
        int x = entrada.nextInt();

        while (x != 0){

            System.out.print("Digite um numero: ");
            soma += x;
            x = entrada.nextInt();

        }

        System.out.println(soma);

        entrada.close();

    }

}

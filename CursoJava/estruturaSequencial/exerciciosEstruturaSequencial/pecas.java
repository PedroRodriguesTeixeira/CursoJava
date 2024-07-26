package CursoJava.estruturaSequencial.exerciciosEstruturaSequencial;
import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

public class pecas {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o codigo da peça 1: ");
        int codPeca = sc.nextInt();
        System.out.print("Digite o numero de peças 1: ");
        int numeroDePecas = sc.nextInt();
        System.out.print("Digite o valor unitario de cada peça: ");
        double vlUnit = sc.nextDouble();

        System.out.println();

        System.out.print("Digite o codigo da peça 2: ");
        int codPeca2 = sc.nextInt();
        System.out.print("Digite o numero de peças 2: ");
        int numeroDePecas2 = sc.nextInt();
        System.out.print("Digite o valor unitario de cada peça: ");
        double vlUnit2 = sc.nextDouble();

        double total;

        total = numeroDePecas * vlUnit + numeroDePecas2 * vlUnit2;

        System.out.printf("O valor a pagar: %.2f", total);


        sc.close();

    }


}

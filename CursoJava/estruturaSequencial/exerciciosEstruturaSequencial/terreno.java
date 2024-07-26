package CursoJava.exerciciosEstruturaSequencial;
import java.util.Scanner;

/*Fazer um programa para ler as medidas da largura e comprimento de um terreno
retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
conforme exemplo.*/

public class terreno {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double largura, comprimento, valor, area, total;

        System.out.println("Utilize as medidas com ','");
        System.out.print("Escreva o tamanho da largura do terreno:");
        largura = sc.nextDouble();
        System.out.print("Escreva o tamanho do comprimento do terreno:");
        comprimento = sc.nextDouble();
        System.out.print("Escreva o tamanho do valor do terreno:");
        valor = sc.nextDouble();

        area = largura * comprimento;
        total = area * valor;

        System.out.println();
        System.out.printf("A area do terreno = %.2f\n", area);
        System.out.printf("O valor do terreno em metros quadrados  = %.2f\n", total);

        sc.close();

    }

}

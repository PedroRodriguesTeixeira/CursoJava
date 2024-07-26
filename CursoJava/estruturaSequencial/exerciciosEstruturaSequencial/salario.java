package CursoJava.exerciciosEstruturaSequencial;
import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

public class salario {

    public static void main (String[] args){


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero do funcionario: ");
        int numeroFuncionario = entrada.nextInt();
        System.out.print("Digite o numero de horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();
        System.out.print("Digite o valor  que recebe por hora trabalhada: ");
        double salario = entrada.nextDouble();


        System.out.println();

        salario = salario * horasTrabalhadas;

        System.out.printf("NUMBERO DO FUNCIONARIO = %d\nSALARIO = R$%.2f\n", numeroFuncionario, salario);


        entrada.close();

    }

}

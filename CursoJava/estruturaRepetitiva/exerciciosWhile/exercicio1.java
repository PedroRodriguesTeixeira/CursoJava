package CursoJava.estruturaRepetitiva.exerciciosWhile;

import java.util.Scanner;

public class exercicio1 {

    /*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        int senha = entrada.nextInt();
        while(senha != 2002){
            System.out.print("Senha invalida!\n");
            System.out.print("Digite sua senha: ");
            senha = entrada.nextInt();
        }
        System.out.println("Acesso permitido!");
        entrada.close();

    }
}

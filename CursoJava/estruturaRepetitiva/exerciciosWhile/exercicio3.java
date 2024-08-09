package CursoJava.estruturaRepetitiva.exerciciosWhile;
import java.util.Scanner;

public class exercicio3 {

    /*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int diesel = 0, gasolina = 0, alcool = 0, preferencia;

        System.out.println("\n === Posto ===\n");
        System.out.println("1. Alcool\n2.Gasolina\n3.Diesel\n");
        System.out.println("Digite os produtos que voce tem preferencia: ");
        preferencia = entrada.nextInt();

        while(preferencia != 4){
            if(preferencia == 1){
                ++alcool;
            } else if(preferencia == 2){
                ++gasolina;
            } else if(preferencia == 3){
                ++diesel;
            }
            preferencia = entrada.nextInt();
        }
        System.out.println("\nMuito obrigado!");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);

        entrada.close();

    }

}

package BeeCrowd;

import java.util.Scanner;

public class Salario {
    public static void main(String [] args){

        Scanner x = new Scanner(System.in);

        int numero = x.nextInt();
        int horas = x.nextInt();
        double porHora = x.nextDouble();

        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = U$ %.2f\n", horas*porHora);
    }
}

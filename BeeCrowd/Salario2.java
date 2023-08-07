package BeeCrowd;

import java.util.Scanner;

public class Salario2 {
    
    public static void main(String [] args){

        Scanner x = new Scanner(System.in);

        String nome = x.nextLine();

        double fixo = x.nextDouble();
        double feito = x.nextDouble();
        double total = (feito*0.15) + fixo;
        System.out.printf("TOTAL = U$ %.2f\n", total);
    }
}

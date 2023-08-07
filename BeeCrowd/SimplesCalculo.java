package BeeCrowd;

import java.util.Scanner;

public class SimplesCalculo {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);

        double TOTAL = 0;

        for(int i=0; i<2;i++){
        int codigo = x.nextInt();
        int qnt = x.nextInt();
        double valor = x.nextDouble();
        TOTAL += valor*qnt;
        }
        

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", TOTAL);


    }
}

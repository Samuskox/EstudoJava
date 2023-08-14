package BeeCrowd;

import java.math.BigDecimal;
import java.util.Scanner;

public class ReaisMoney {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        double a = x.nextDouble();
        x.close();

        int Notas = (int)a;
        int Moedas = -(int)((Notas - a)*100);

        //double Total = a;

        int real100 = 0;
        int real50 = 0;
        int real20 = 0;
        int real10 = 0;
        int real5 = 0;
        int real2 = 0;
        int real1 = 0;
        int moeda50 = 0;
        int moeda25 = 0;
        int moeda10 = 0;
        int moeda5 = 0;
        int moeda1 = 0;
        
        System.out.println(Notas);
        System.out.println(Moedas);



        while(Notas >= 100){
            Notas -= 100;
            real100++;
        }

        while(Notas >= 50){
            Notas -= 50;
            real50++;
        }

        while(Notas >= 20){
            Notas -= 20;
            real20++;
        }

        while(Notas >= 10){
            Notas -= 10;
            real10++;
        }

        while(Notas >= 5){
            Notas -= 5;
            real5++;
        }

        while(Notas >= 2){
            Notas -= 2;
            real2++;
        }

        while(Notas >= 1){
            Notas -= 1;
            real1++;
        }

        while(Moedas >= 50){
            Moedas -= 50;
            moeda50++;
        }

        while(Moedas >= 25){
            Moedas -= 25;
            moeda25++;
        }

         while(Moedas >= 10){
            Moedas -= 10;
            moeda10++;
        }

         while(Moedas >= 5){
            Moedas -= 5;
            moeda5++;
        }

         while(Moedas >= 1){
            Moedas -= 1;
            moeda1++;
        }

        System.out.println("NOTAS:");
        System.out.println(real100+" nota(s) de R$ 100.00");
        System.out.println(real50+" nota(s) de R$ 50.00");
        System.out.println(real20+" nota(s) de R$ 20.00");
        System.out.println(real10+" nota(s) de R$ 10.00");
        System.out.println(real5+" nota(s) de R$ 5.00");
        System.out.println(real2+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(real1+" moeda(s) de R$ 1.00");
        System.out.println(moeda50+" moeda(s) de R$ 0.50");
        System.out.println(moeda25+" moeda(s) de R$ 0.25");
        System.out.println(moeda10+" moeda(s) de R$ 0.10");
        System.out.println(moeda5+" moeda(s) de R$ 0.05");
        System.out.println(moeda1+" moeda(s) de R$ 0.01");


    }
}

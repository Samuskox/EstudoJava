package BeeCrowd;

import java.util.Scanner;

public class ReaisMoney {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        double a = x.nextDouble();
        x.close();

        double Total = a;

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



        while(Total >= 100){
            Total -= 100;
            real100++;
        }

        while(Total >= 50){
            Total -= 50;
            real50++;
        }

        while(Total >= 20){
            Total -= 20;
            real20++;
        }

        while(Total >= 10){
            Total -= 10;
            real10++;
        }

        while(Total >= 5){
            Total -= 5;
            real5++;
        }

        while(Total >= 2){
            Total -= 2;
            real2++;
        }

        while(Total >= 1){
            Total -= 1;
            real1++;
        }

        while(Total >= 0.50){
            Total -= 0.50;
            moeda50++;
        }

        while(Total >= 0.25){
            Total -= 0.25;
            moeda25++;
        }

         while(Total >= 0.10){
            Total -= 0.10;
            moeda10++;
        }

         while(Total >= 0.05){
            Total -= 0.05;
            moeda5++;
        }

        System.out.println(Total);

         while(Total >= 0.01){
            Total -= 0.01;
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

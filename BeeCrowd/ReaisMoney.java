package BeeCrowd;

import java.util.Scanner;

public class ReaisMoney {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();

        int Total = a;

        int real100 = a / 100;
        Total -= real100*100;
        int real50 = Total /50;
        Total -= real50*50;
        int real20 = Total / 20;
        Total -= real20*20;
        int real10 = Total / 10;
        Total -= real10*10;
        int real5 = Total /5;
        Total -= real5*5;
        int real2 = Total/2;
        Total -= real2*2;
        int real1 = Total;


        
        System.out.println(a);
        System.out.println(real100+" nota(s) de R$ 100,00");
        System.out.println(real50+" nota(s) de R$ 50,00");
        System.out.println(real20+" nota(s) de R$ 20,00");
        System.out.println(real10+" nota(s) de R$ 10,00");
        System.out.println(real5+" nota(s) de R$ 5,00");
        System.out.println(real2+" nota(s) de R$ 2,00");
        System.out.println(real1+" nota(s) de R$ 1,00");


    }
}

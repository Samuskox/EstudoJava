package BeeCrowd;

import java.util.Scanner;

public class Salario2 {
    
    public static void main(String [] args){

        Scanner x = new Scanner(System.in);

       float s = x.nextFloat();
       float sp = 0; // salario percentual
       float ns = 0; // novo salario

       if(s >= 0 && s <= 400 ){
        sp = (float) (s * 0.15);
        ns = sp+s;
        System.out.printf("Novo salario: %.2f\n", ns);
        System.out.printf("Reajuste ganho: %.2f\n", sp);
        System.out.println("Em percentual: 15%");
       } else if(s > 400 && s <= 800 ){
        sp = (float) (s * 0.12);
        ns = sp+s;
        System.out.printf("Novo salario: %.2f\n", ns);
        System.out.printf("Reajuste ganho: %.2f\n", sp);
        System.out.println("Em percentual: 12%");
       } else if(s > 800 && s <= 1200 ){
        sp = (float) (s * 0.10);
        ns = sp+s;
        System.out.printf("Novo salario: %.2f\n", ns);
        System.out.printf("Reajuste ganho: %.2f\n", sp);
        System.out.println("Em percentual: 10%");
       } else if(s > 1200 && s <= 2000 ){
        sp = (float) (s * 0.07);
        ns = sp+s;
        System.out.printf("Novo salario: %.2f\n", ns);
        System.out.printf("Reajuste ganho: %.2f\n", sp);
        System.out.println("Em percentual: 7%");
       } else if(s > 2000 ){
        sp = (float) (s * 0.04);
        ns = sp+s;
        System.out.printf("Novo salario: %.2f\n", ns);
        System.out.printf("Reajuste ganho: %.2f\n", sp);
        System.out.println("Em percentual: 4%");
       }
    }
}

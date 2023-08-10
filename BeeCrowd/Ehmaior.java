package BeeCrowd;

import java.util.Scanner;
import java.lang.Math;

public class Ehmaior {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        int maior = (((a+b+Math.abs(a-b))/2) + c + Math.abs(((a+b+Math.abs(a-b))/2) - c))/2;

        System.out.println(maior+" eh o maior");


    }
}

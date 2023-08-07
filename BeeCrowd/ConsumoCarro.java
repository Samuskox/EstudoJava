package BeeCrowd;

import java.util.Scanner;

public class ConsumoCarro {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        float b = x.nextFloat();

        double media = a/b;

        System.out.printf("%.3f km/l\n", media);
        //System.out.println("MEDIA = "+media);
    }
}

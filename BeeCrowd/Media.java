package BeeCrowd;

import java.util.Scanner;


public class Media {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);

        double a = x.nextDouble();
        double b = x.nextDouble();

        double media = (a) + (b)/2;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}

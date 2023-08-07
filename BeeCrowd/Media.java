package BeeCrowd;

import java.util.Scanner;


public class Media {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);

        float a = x.nextFloat();
        float b = x.nextFloat();

        double media = ((a*3.5) + (b*7.5))/(11);

        System.out.printf("MEDIA = %.5f\n", media);
        //System.out.println("MEDIA = "+media);
    }
}

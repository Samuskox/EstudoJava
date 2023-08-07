package BeeCrowd;

import java.util.Scanner;

public class Media2 {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        double media = ((a*2)+(b*3)+(c*5))/10;

        System.out.printf("MEDIA = %.1f", media);
    }
}

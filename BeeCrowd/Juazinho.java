package BeeCrowd;

import java.util.Scanner;

public class Juazinho {
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);

        int h = x.nextInt();
        int km = x.nextInt();

        double m = (h*km)/12.0;

        System.out.printf("%.3f", m);
    }
}

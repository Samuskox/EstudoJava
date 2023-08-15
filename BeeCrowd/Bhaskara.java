package BeeCrowd;

import java.util.Scanner;

public class Bhaskara {
        public static void main(String[]args){
        Scanner x = new Scanner(System.in);

        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();

        double R1 = 0;
        double R2 = 0;

        double delta = ((b*b)-4*a*c);

        if(delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-b+ Math.sqrt(delta))/(2*a);
            R2 = (-b- Math.sqrt(delta))/(2*a);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }


        //System.out.println("MEDIA = "+media);
    }
}

package BeeCrowd;

import java.util.Scanner;

public class Intervalo {
        public static void main(String[] args){
            Scanner x = new Scanner(System.in);

            double h = x.nextDouble();

            if(h < 0 || h > 100){
                System.out.println("Fora de intervalo");
            } else{
                if(h >= 0.0 && h <= 25.0){
                    System.out.println("Intervalo [0,25]");
                } else if(h > 25.0 && h <= 50.0){
                    System.out.println("Intervalo (25,50]");
                } else if (h > 50.0 && h <= 75.0){
                    System.out.println("Intervalo (50,75]");
                } else if(h > 75.0 && h <= 100.0){
                    System.out.println("Intervalo (75,100]");
                }
            }
    }
}

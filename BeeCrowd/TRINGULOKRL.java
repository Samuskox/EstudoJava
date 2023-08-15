package BeeCrowd;

import java.util.Scanner;

public class TRINGULOKRL {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();

        double ab = a-b;
        double ac = a-c;
        double bc = b-c;

        boolean DAouNaoDa = false;

        //System.out.printf("VOLUME = %.3f\n", volume);

        if(
        ((Math.abs(bc) < a)&&(a < (b+c))) &&
        ((Math.abs(ac) < b)&&(b < (a+c))) &&
        ((Math.abs(ab) < c)&&(c < (b+a)))
        ){
            DAouNaoDa = true;
        } 

        if(DAouNaoDa == true){
            Double p = a+b+c;

            System.out.printf("Perimetro = %.1f", p);
        } else {
            double AREAA = ((a+b)*c)/2;
            System.out.printf("Area = %.1f", AREAA);
        }
    }
}

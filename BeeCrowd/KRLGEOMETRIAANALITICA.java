package BeeCrowd;

import java.util.Scanner;
import java.lang.Math;

public class KRLGEOMETRIAANALITICA {

    public static void main(String [] args){
        Scanner wtf = new Scanner(System.in);

        double x[];
        x = new double[2];
        double y[];
        y = new double[2];
        
            x[0] = wtf.nextDouble();
            y[0] = wtf.nextDouble();
    
            x[1] = wtf.nextDouble();
            y[1] = wtf.nextDouble();
        
        

        
        double X2 = (x[1] - x[0])* (x[1] - x[0]);
        double Y2 = (y[1] - y[0])*(y[1] - y[0]);
        double a = X2 + Y2;
        double distanc = Math.sqrt(a);

        System.out.printf("%.4f\n", distanc);
    }
}

package BeeCrowd;

import java.util.Scanner;

public class SelecaoTeste{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        int A = x.nextInt();
        int B = x.nextInt();
        int C = x.nextInt();
        int D = x.nextInt();

        if(B > C && D > A){
            if(C+D > A+B){
                if(C > 0 && D > 0){
                    if(A % 2 == 0){
                        System.out.println("Valores aceitos"); 
                    }
                }
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
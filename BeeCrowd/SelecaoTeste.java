package BeeCrowd;

import java.util.Scanner;

public class SelecaoTeste{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        int A = x.nextInt();
        int B = x.nextInt();
        int C = x.nextInt();
        int D = x.nextInt();

        int verificacao = 0;




        if(B > C && D > A){
            verificacao++;
        } 
        if(C+D > A+B){
            verificacao++;
        }

        if(C > 0 && D > 0){
            verificacao++;
        }
        if(A % 2 == 0){
            verificacao++;
        }
        if(verificacao == 4){
            System.out.println("Valores aceitos"); 
        }else {
            System.out.println("Valores nao aceitos");
        }
    }
}
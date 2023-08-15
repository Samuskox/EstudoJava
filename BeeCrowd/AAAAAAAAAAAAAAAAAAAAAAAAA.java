package BeeCrowd;

import java.util.Scanner;

public class AAAAAAAAAAAAAAAAAAAAAAAAA {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);

        int n1 = x.nextInt();
        int n2 = x.nextInt();
        int n3 = x.nextInt();
        int t = 0;

        int KRLn1 = n1;
        int KRLn2 = n2;
        int KRLn3 = n3;


        if(n1 < n3){
            t = n1;
            n1 = n3;
            n3=t;
        }

        if(n1 < n2){
            t = n1;
            n1 = n2;
            n2=t;
        }

        if(n2 < n3){
            t=n2;
            n2 = n3;
            n3=t;
        }

        if(n1 < n3){
            t = n1;
            n1 = n3;
            n3=t;
        }

        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);

        System.out.println();

        System.out.println(KRLn1);
        System.out.println(KRLn2);
        System.out.println(KRLn3);
    }
}

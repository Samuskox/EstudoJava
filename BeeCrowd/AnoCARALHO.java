package BeeCrowd;

import java.util.Scanner;

public class AnoCARALHO {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
            int a = x.nextInt();
           int totaldias = a;
           int ano = 0;
           int mes = 0;
           int dia = 0;
            
                
            while(totaldias >= 365){
                totaldias -=  365;
                ano++;
            }

            while(totaldias >= 30){
                totaldias -=  30;
                mes++;
            }

           
            System.out.println(ano+" ano(s)");
            System.out.println(mes+" mes(s)");
            System.out.println(totaldias+" dia(s)");
           

    }
}

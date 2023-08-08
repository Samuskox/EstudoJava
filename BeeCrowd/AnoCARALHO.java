package BeeCrowd;

import java.util.Scanner;

public class AnoCARALHO {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
            int a = x.nextInt();

        int dia = 1;
        int mes = 0;
        int ano = 0;

            for(int i=0;i<a;i++){
                if(dia == 30){
                    mes++;
                    dia = 0;
                }

                if(mes == 12){
                    ano++;
                    mes = 0;
                }

                dia++;
            }

            System.out.println(dia);
            System.out.println(mes);
            System.out.println(ano);
    }
}

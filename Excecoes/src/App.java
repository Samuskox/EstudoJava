import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        int A = 0;

        System.out.println("OLA");

        do{

            if(A > 2){
                //break;
            }

        try {
            
        System.out.println("FALA UM NUMERO AI KRL");
        int a = x.nextInt();

        System.out.println("FALA UM SEGUNDO NUMERO AI CARA DE CU");
        int b = x.nextInt();

        double c = a/b;

        System.out.println("Esse é o resultado krl: "+c); 
        } catch (java.lang.ArithmeticException e ) {
            System.out.println("VOCE ``E  BURRO KRL VAI DIVIDIR POR ZERO PORRA N TEM NOÇÂO DEE INIFINITO NAO");
            A++;
        } catch (java.util.InputMismatchException e){
            System.out.println("ISSO N É ALGEBRA OU MATEMATICA DISCRETA PRA TU FICAR COLOCANDO LETRA NEESSSSAA PORRAAA");
            A++;
            
        } catch (Exception e){
             System.out.println("SEI LA PORRA TA CERTO ISSO ?");
             A++;
        } 
        finally{
            System.out.println("OXI VAI PRO MARANHÃO");
        }

       } while(A==1);
        
    }
}

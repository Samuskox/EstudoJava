import java.util.ArrayList;
import java.util.Random;


public class ArrayLista2 {
    public static void main(String[] args) throws Exception{
        //String[] alunos = {"Elizabete","Julia","Pedro","Rato","Farah"};

        ArrayList<Integer> num = new ArrayList<Integer>();

        Random random = new Random();

        for(int i = 0; i < random.nextInt(5000); i++){
            num.add(random.nextInt(300));
        }

        for(Integer i : num){
            System.out.print(" "+i);
        }
    }
}

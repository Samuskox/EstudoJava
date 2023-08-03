import java.util.ArrayList;
import java.util.Random;


public class ArrayLista2 {
    public static void main(String[] args) throws Exception{
        //String[] alunos = {"Elizabete","Julia","Pedro","Rato","Farah"};

        ArrayList<Integer[]> num = new ArrayList<Integer[]>();

        Random random = new Random();

        for(int i = 0; i < n2; i++){
            
            num.add(i, num);
        }

        for(Integer[] i : num){
            System.out.print(i);
        }
    }
}

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args){
        ArrayList<String> gems = new ArrayList<String>();

        gems.add("Ametista");
        gems.add("Ruby");
        gems.add("pérola");

        //gems.set(0, "Diamante");
        //gems.remove(2);
      

        for(int i=0; i < gems.size(); i++){
            System.out.println(gems.get(i));
        }
    }
}

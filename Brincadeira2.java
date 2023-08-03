import java.util.Locale;
import java.util.Random;

import javax.swing.JOptionPane;

public class Brincadeira2 {
    public static void main(String[] args){
        Random random = new Random();
        

        ///String name = JOptionPane.showInputDialog("Digite seu nome");
        ///JOptionPane.showMessageDialog(null,"Olá"+name);
        int codigo = 0;
        do{
            if(codigo == -1){
                JOptionPane.showMessageDialog(null,"Digite novamente o sabor de pizza");
            }
        String sabor = JOptionPane.showInputDialog(null, "\n Digite o sabor de pizza que você queira:\n 1 - Mussarela\n 2 - Calabresa\n 3 - Peperonni\n 4 - Atum");
        sabor = sabor.toLowerCase(Locale.getDefault());
        System.out.println(sabor);
        if(sabor == "mussarela"){
            codigo = 1;
            System.out.println("AA");
        } else if(sabor == "calabresa"){
            codigo = 2;
        } else if(sabor == "peperonni"){
            codigo = 3;
        } else if(sabor == "atum"){
            codigo = 4;
        } else {
            codigo = -1;
        } 
        }while(codigo == -1);
        

    }
}

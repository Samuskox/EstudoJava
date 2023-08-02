import javax.swing.JOptionPane;

public class GUIintro {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Fala teu nome ai mermão");
        JOptionPane.showMessageDialog(null, "Eai "+name);

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Fala o ano que tu nasceu meno"));
        int idade = 2023 - ano;
        JOptionPane.showMessageDialog(null, "Você ta velho pra cacete mermão ein "+idade+" anos" );
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Fala quanto tu mede fi"));
        JOptionPane.showMessageDialog(null, "Você mede "+altura );
    }
}

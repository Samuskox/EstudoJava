package Pizzaria;

public class main {
    public static void main(String[] args){
        Pizza pizza1 = new Pizza("Tradicional", "Tomate");

        System.out.println("Aqui está os ingredientes da sua pizza: ");
        System.out.println(pizza1.massa);
        System.out.println(pizza1.molho);
        System.out.println(pizza1.tipo);
        System.out.println(pizza1.acompanhamento);
    }
}

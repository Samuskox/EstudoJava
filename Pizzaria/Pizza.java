package Pizzaria;

public class Pizza {

    String massa;
    String molho;
    String tipo;
    String acompanhamento;

    Pizza(String massa, String molho, String tipo, String acompanhamento){
        this.massa = massa;
        this.molho = molho;
        this.tipo = tipo;
        this.acompanhamento = acompanhamento;
    }
     Pizza(String massa, String molho, String tipo){
        this.massa = massa;
        this.molho = molho;
        this.tipo = tipo;
        //this.acompanhamento = acompanhamento;
    }
    Pizza(String massa, String molho){
        this.massa = massa;
        this.molho = molho;
        //this.tipo = tipo;
        //this.acompanhamento = acompanhamento;
    }

}
